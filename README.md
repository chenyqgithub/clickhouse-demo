#springboot 整合 mybatis-plus+clickhouse 

#数据库采用docker安装 
#安装地址 https://hub.docker.com/r/yandex/clickhouse-server


# cpu配置 2.9GHz 4核心 4G ssd
# 数据库      插入     耗时
# mysql      10w 1.1-1.2s 20w 4-8s+
# clickhouse 10w 1.5-1.6s 20w 2.9-3.0s 30w 4.5-4.7s 50w 7.6-7.9s 100w 15s
