package com.clickhouse.example.clickhouse.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.clickhouse.example.clickhouse.entity.UserInfo;
import com.clickhouse.example.clickhouse.mapper.UserInfoMapper;
import com.clickhouse.example.clickhouse.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 陈永全
 * @date 2021/05/06 16:13
 */
@RestController
@RequestMapping("/user_info")
public class UserInfoController {
    @Resource
    UserInfoMapper userInfoMapper;
    @Resource
    UserInfoService userInfoService;

    @GetMapping("/list")
    public List<UserInfo> list() {
        long l = System.currentTimeMillis();
        List<UserInfo> userInfos = userInfoMapper.selectList(Wrappers.<UserInfo>lambdaQuery().like(UserInfo::getUserName,"10285").orderByDesc(UserInfo::getUserName));

        Long s = System.currentTimeMillis()-l;
        System.out.println( "耗时:"+s);
        return userInfos;
    }

    @GetMapping("/insert")
    public Boolean insert(Integer rows) {
        List<UserInfo> temp = new ArrayList<>();
        if (rows != null && rows > 0) {
            long l1 = System.currentTimeMillis();
            for (int i = 0; i < rows; i++) {
                UserInfo userInfo = new UserInfo();
                userInfo.setUserId(i);
                userInfo.setUserName("test"+i);
                userInfo.setSex(i%2==0?1:2);
                temp.add(userInfo);
            }

            long s2 = System.currentTimeMillis()-l1;
            System.out.println("构造数据耗时："+s2+"毫秒");
//            String collect = temp.stream().map(a -> ("('" + a.getUserName() + "'," + a.getSex() + ")")).collect(Collectors.joining(","));
            long l = System.currentTimeMillis();
            boolean b = userInfoService.saveBatch(temp, temp.size());
//            userInfoMapper.saveAll(collect);
            long s = System.currentTimeMillis()-l;
            System.out.println("插入耗时："+s+"毫秒");

        }
        return true;
    }
}
