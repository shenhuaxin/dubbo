Dubbo对外暴露的配置都是有该模块进行解析的。

例如，dubbo-config-api 子模块负责处理 API 方式使用时的相关配置。
dubbo-config-spring 子模块负责处理与 Spring 集成使用时的相关配置方式。
有了 dubbo-config 模块，用户只需要了解 Dubbo 配置的规则即可，无须了解 Dubbo 内部的细节。