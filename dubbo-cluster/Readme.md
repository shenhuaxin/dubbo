Dubbo中负责管理集群的模块，提供了负载均衡、容错、路由等一系列集群相关的功能，最终的目的是将多个Provider伪装成一个Provider.

这样Consumer就可以像调用一个Provider那样调用Provider集群了。
