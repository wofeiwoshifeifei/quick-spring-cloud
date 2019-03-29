# quick-spring-cloud

## 1.quick-spring-cloud 是一个快速配置spring cloud的基础构建框架，适合了解以及搭建spring cloud框架
    spring cloud 入门篇（一）框架总体概览，简易版本
![Image text](https://raw.githubusercontent.com/wofeiwoshifeifei/quick-spring-cloud/master/asserts/easyModel.jpg)

## 2.apollo配置
    能够集中化管理应用不同环境、不同集群的配置，配置修改后能够实时推送到应用端，并且具备规范的权限、流程治理等特性，
    适用于微服务配置管理场景。
    官方架构图：
![Image text](https://raw.githubusercontent.com/ctripcorp/apollo/master/doc/images/apollo-deployment.png)
    
 
## 3.elesticSearch+Kibana+Beats+Logstash日志管理系统构建
    在6.6.0+以上测试过
    默认是6.7.0，构建不同版本请修改shell脚本中的tool_version
    一键构建脚本
    quick-log-center: 
    安装了curl工具的使用：build-curl.sh
    wget工具:build-wget.sh
    说明：配置文件需放在对应的conf目录下，如filebeat-my-config.yml

## 4.srping cloud与高可用，高稳定性?
    常见影响问题以及解决方式：
    1.事务中包含外部调用：
       rabbitmq去处理容易超时的
    2.超时时间和重试次数不合理
    3.外部依赖熔断机制：
        Hiystrix 配置超时，重试以及熔断，
        手工熔断
    4.上游限流：
        业务性能测试分析出最大qps
        Netflix的Hystrix
    5.慢查询问题：
        读写分离。写走主库，读走从库。
        索引优化。索引过多会影响数据库写性能。索引不够查询会慢。 
    6.依赖方不合理：
        强依赖改为弱依赖
    7.废弃逻辑和临时代码，尽量显示调用以及标记过时
    8.接口无用即时下线
    9.核心路径资源分离：
        服务器物理隔离原则
        渠道分离
        线程池资源隔离
        信号量资源隔离
        



