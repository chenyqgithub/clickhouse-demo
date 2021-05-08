package com.clickhouse.example.clickhouse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.clickhouse.example.clickhouse.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 陈永全
 * @date 2021/05/06 16:10
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    @Insert("insert into user_info  (user_name,sex) values ${sql}")
    void saveAll(String sql);
}
