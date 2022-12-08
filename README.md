# grpc-spring-boot-demo
这是一个使用 Spring Boot 和 gRPC 开发的示例微服务项目，使用 Java 版本 1.8

<img src="https://img.shields.io/badge/Language-Java-orange.svg">


## 项目模块说明:
- grpc-client
    - 客户端，用于接收请求向服务端发送请求.
    - 定义了4个接口：
		- queryInfo 	该接口使用简单 grpc，即客户端发送一次数据，服务端返回一次数据
		- querySomeData 该接口使用服务端流式 grpc，即客户端发送一次数据，服务端返回多次数据
		- sendBooksInfo 该接口使用客户端流式 grpc，即客户端发送多次数据，服务端返回一次数据
		- calculateSum  该接口使用双向流式 grpc，即客户端发送多次数据，服务端返回多次数据

- grpc-protocol
    - 存放proto文件，用于生成java代码，最终打包成 grpc-protocol.0.0.1-SNAPSHOT.jar 提供给 grpc-client 和 grpc-server 使用.

- grpc-server
    - 服务端，接收客户端的请求处理后返回结果给客户端.


## 使用
- 1.项目所需依赖都下载后，将 grpc-protocol 模块使用 maven install 命令将 proto 生成 java 代码并打成 jar 包。如果你使用 idea 编译器直接点击 maven 插件中 grpc-protocol 下的 Lifecyle 下的 install

- 2.分别启动 grpc-client 客户端和 grpc-server 服务端

- 3.浏览器打开http://localhost:8080/swagger-ui/index.html 选择接口列表里的接口，点击Try it out，输入参数，点击Execute。接口将会返回结果到下面的code部分


## 版权和许可
该项目根据 MIT 许可条款获得许可

