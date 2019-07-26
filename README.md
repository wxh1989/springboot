# springboot 学习笔记
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
通过这个URL去访问 **https://127.0.0.1:8888/springBoot/uploadFile/xx.jpg**会报404错误。    
	[![weibo-logo]](http://weibo.com/linpiaochen)
