package com.domain.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*<context:component-scan base-package="com.domain"/>*/
@Configuration
@ComponentScan("com.domain")
public class AppConfig {

}
