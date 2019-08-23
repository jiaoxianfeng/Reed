# `SpringBoot`连接`MongoDB`数据库

## ==pom.xml==

### 添加两条依赖

```xml
<dependency>
	<groupId>org.springframework.boot</groupId> <artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>
<dependency>
	<groupId>org.mongodb</groupId>
	<artifactId>mongo-java-driver</artifactId>
</dependency>
```

## ==application.properties==

### 设置`mongodb`的远程连接路径、端口和对应的数据库

```properties
spring.data.mongodb.uri=mongodb://47.93.23.141:27017/test
```

## ==Website.java==

### 实体类，用于从数据库中读取对应的数据

### 需要设置`collection`和`Field`，对于id可以不设置`Field`使用`@Id`

## ==DemoApplication.java==

### 设置`Mapping`，`method`可以不写，或者使用`GET`方法，`POST`方法会无法获取到数据

### 可以直接使用`MongoTemplate`，`SpringBoot`会自动注入
