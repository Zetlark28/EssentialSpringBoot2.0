package it.ezpeleta.lil.roomwebapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //permission to all api
        http.authorizeRequests().antMatchers("/", "/api*")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                //set login page and permission to all
                .loginPage("/login").permitAll()
                .and()
                .logout().permitAll();
    }
    @Autowired
    public void ConfigureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //NoOpPasswordEncoder use only for demo
        auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
                .withUser("user").password("password").roles("USER");
    }
}
