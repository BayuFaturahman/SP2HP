package com.pusiknas.web.config;

//import com.pusiknas.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//  @Autowired
//  private UserService userService;

//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
//  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
        .antMatchers("/login","/forgot","/reset",
            "/resources/**", "/webjars/**",
            "/assets/**", "/resources/**",
            "/static/**", "/js/**", "/img/**", "/frontend/**","/uploads/**",
            "/public/**",
            "/user/**").permitAll()
        .and()
        .csrf()
        .disable()
        .formLogin()
        .loginPage("/login")
        .defaultSuccessUrl("/home")
        .failureUrl("/login?error=true").permitAll()
        .usernameParameter("username")
        .passwordParameter("password")
        .and()
        .logout()
        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
        .logoutSuccessUrl("/login")
        .and()
        .exceptionHandling()
        .accessDeniedPage("/access-denied");
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
