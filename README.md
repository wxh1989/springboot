# springboot 学习笔记

资源文件映射，找不资源的解决方法
  如果要用 @ConfigurationProperties 映射其他非 application.properties 资源文件的属性
  一定要在 pom 里引用 
  
        <dependency>
            <groupId> org.springframework.boot </groupId>
            <artifactId> spring-boot-configuration-processor </artifactId>
            <optional> true </optional>
        </dependency>
        
  这个资源
  并且 要在类上方 加入 @Component(这个注解也可以替换成 @Service) 和 @PropertySource 注解
  
  
  
  
