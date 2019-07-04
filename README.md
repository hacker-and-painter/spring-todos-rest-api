# spring-todos-rest-api

[![Build Status](https://travis-ci.org/luanpotter/spring-todos-rest-api.svg?branch=master)](https://travis-ci.org/luanpotter/spring-todos-rest-api)

这是一个用于todo模型的CRUD REST api，它有两个字段：Long id和String text（todo的文本）。

它使用Spring，包括Spring Boot和Spring Data，用于JPA实现。它使用零xml文件进行配置（当然，除了pom.xml文件，因为它是一个maven项目）。

## 启动

Run

```bash
  mvn clean install
```
要下载所有依赖项等，请启动API

```bash
  mvn spring-boot:run
```

或者，您可以导入Intellij IDEA（通过Import maven项目选项），然后使用IDE中的命令运行。
