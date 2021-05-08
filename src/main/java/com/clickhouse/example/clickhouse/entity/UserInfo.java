package com.clickhouse.example.clickhouse.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 陈永全
 * @date 2021/05/06 16:11
 */
@Data
@TableName("user_info")
public class UserInfo {
    @TableId(value = "user_id")
    private Integer userId;
    private String userName;
    private Integer sex;
}
