# 史上最简单的 SpringCloud 教程 
[本文及项目部分引用之方志朋博客](http://blog.csdn.net/forezp/article/details/70148833) 
>     用于学习笔记
## spring could 简介
spring cloud 为开发人员提供了快速构建分布式系统的一些工具，包括配置管理、服务发现、断路器、路由、微代理、事件总线、全局锁、决策竞选、分布式会话等等。它运行环境简单，可以在开发人员的电脑上跑。另外说明spring cloud是基于springboot的，所以需要开发中对springboot有一定的了解，如果不了解的话可以看这篇文章：2小时学会springboot。另外对于“微服务架构” 不了解的话，可以通过搜索引擎搜索“微服务架构”了解下。

* ### 服务注册和发现 Eureka (Spring cloud Eetflix)
    * 1  
    
        模块名称 **`eurekaserver`**  
        
        启动一个服务注册中心，只需要一个注解@EnableEurekaServer，这个注解需要在springboot工程的启动application类上加：
    * 2  
    
        模块名称 **`eurekaclient`**  
        
        当client向server注册时，它会提供一些元数据，例如主机和端口，URL，主页等。Eureka server 从每个client实例接收心跳消息。 如果心跳超时，则通常将该实例从注册server中删除。  
        
        通过注解@EnableEurekaClient 表明自己是一个eurekaclient.  
        
        添加配置文件
    
* ### 服务消费者 RestTemplate + ribbon

* ### 服务消费者 Feign
    # `Load balancer does not have available server for client: service-hi` 处理办法：
        在配置文件加：
               feign:
                 hystrix:
                   enabled: true
               ribbon:
                 eureka:
                   enabled: false
               然后加：
                service-hi: （此项为调用的服务名）
                   ribbon:
                      listOfServers: http://localhost:8763,http://localhost:8764 （服务名的url及端口）

* ### 断路器 Hystrix