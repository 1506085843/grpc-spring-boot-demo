package com.example.grpcclient.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/**
 * swagger配置
 * SwaggerConfig
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build()
                .securitySchemes(securitySchemes())
                .securityContexts(securityContexts());
    }

    //swagger页面信息
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("我的API接口文档")
                .description("如若没有火炬，我便是唯一的光")
                .version("1.0")
                .build();
    }

    //authorizations token设置
//    private static List<ApiKey> unifiedAuth() {
//        List<ApiKey> arrayList = new ArrayList();
//        arrayList.add(new ApiKey("app-token", "app-token", "header"));
//        return arrayList;
//    }
    private List<SecurityScheme> securitySchemes() {
        List<SecurityScheme> list = new ArrayList<>();
        list.add(new BasicAuth("basicAuth"));
        list.add(new ApiKey("app-token","app-token","header"));
        return list;
    }


    private static List<SecurityContext> securityContexts() {
        return newArrayList(
                SecurityContext.builder()
                        .securityReferences(defaultAuth())
                        .forPaths(PathSelectors.any())
                        .build()
        );
    }

    //authorizations全局设置（设置了token后所有接口生效）
    private static List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global","accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return newArrayList(
                new SecurityReference("app-token",authorizationScopes));
    }
}