# springboot 学习笔记
**1、资源文件映射，找不properties的解决方法**  
  如果要用 @ConfigurationProperties 映射其他非 application.properties 资源文件的属性
  一定要在 pom 里引用**spring-boot-configuration-processor**依赖,并且 要在类上方 加入 @Component(这个注解也可以替换成 @Service) 和 @PropertySource 注解  
 
  
  
  