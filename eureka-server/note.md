Eureka介绍：
Eureka是一个基于REST(Representational State Transfer)的服务，主要用于AWS cloud， 提供服务定位(locating services)、
负载均衡(load balancing)、故障转移(failover of middle-tier servers)。我们把它叫做Eureka Server.

为什么需要Eureka?
在AWS Cloud，由于其天生的特性，服务器经常变换。我们知道每个EC2挂掉后，重启又是一个新的。不像传统的固定IP，AWS的服务器是变化的。
因此需要更复杂的负载均衡方案来动态注册和注销。由于AWS并没有提供中间层负载均衡解决方案，Eureka填补了这个领域的巨大空白。