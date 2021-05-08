package com.clickhouse.example.clickhouse.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.clickhouse.example.clickhouse.entity.UserInfo;
import com.clickhouse.example.clickhouse.mapper.UserInfoMapper;
import com.clickhouse.example.clickhouse.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * @author 陈永全
 * @date 2021/05/06 16:35
 */
@Service
public  class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
}
