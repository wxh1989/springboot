# Spring Boot 问题解决记录
**1、解决: 资源文件映射，找不properties**  
    如果要用 @ConfigurationProperties 映射其他非 application.properties 资源文件的属性
  一定要在 pom 里引用**spring-boot-configuration-processor**依赖,并且 要在类上方 加入 @Component(这个注解也可以替换成 @Service) 和 @PropertySource 注解.
>  <dependency>
    <groupId> org.springframework.boot </groupId>
    <artifactId> spring-boot-configuration-processor </artifactId>
    <optional> true </optional>
  </dependency>
  
**2、解决: 上传文件无法浏览**  
如果文件上传到电脑的某个文件夹内是无法直接通过URL访问的。
如：我将文件上传到 **"E:\\ideaproject\\upload\\"** 这个文件夹，
通过这个URL去访问 **https:///127.0.0.1:8888/springBoot/uploadFile/xx.jpg** 会报404错误。    
    
 ![error](https://github.com/wxh1989/springboot/blob/master/images/404.png)
 要解决这个问题需要配置 Spring Boot **虚拟地址映射**  
 
 Spring Boot 1x 要实现虚拟地址映射需继承 WebMvcConfigurerAdapter。  
 
 Spring Boot 2x 有2种配置1、继承 **WebMvcConfigurationSupport类**和实现**WebMvcConfigurer接口**
 重写 **addResourceHandlers** 方法，本人用的是实现接口的方式
 
``` java
@Configuration
public class WebMvcConfig  implements WebMvcConfigurer { 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) { 
        registry.addResourceHandler("/static/**").
                addResourceLocations("classpath:/static/");
        //这一句代码 说明将/uploadFile/** 这样的路径映射到 实体路径
        registry.addResourceHandler("/uploadFile/**").
                addResourceLocations("file:E:////ideaproject/upload/");
    } 
} 
```
- **特别注意：** 继承 WebMvcConfigurationSupport 类会覆盖Spring Boot 默认配置出现一系列的错误，想紧紧做配置的扩展，要在类上添加
**@EnableWebMvc**注解

	 
