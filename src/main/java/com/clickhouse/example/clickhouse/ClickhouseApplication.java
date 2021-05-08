package com.clickhouse.example.clickhouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.clickhouse.example.clickhouse.mapper")
@SpringBootApplication(scanBasePackages = {"com.clickhouse.example.clickhouse","com.baomidou.mybatisplus"})
public class ClickhouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClickhouseApplication.class, args);
    }

}
