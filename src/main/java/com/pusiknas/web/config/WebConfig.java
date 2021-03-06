package com.pusiknas.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

@Configuration
//@EnableJpaRepositories
//@EnableTransactionManagement
public class WebConfig implements WebMvcConfigurer {

  @Bean
  public SpringSecurityDialect securityDialect() {
    return new SpringSecurityDialect();
  }

}
