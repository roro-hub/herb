package com.herb.config;

import com.herb.common.config.BaseSwaggerConfig;
import com.herb.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.herb.controller")
                .title("药草")
                .description("herb后台相关接口文档")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
