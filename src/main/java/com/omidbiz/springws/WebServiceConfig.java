package com.omidbiz.springws;

import java.io.IOException;

import javax.xml.namespace.QName;

import org.jvnet.jax_ws_commons.spring.SpringService;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

import com.sun.xml.ws.transport.http.servlet.SpringBinding;
import com.sun.xml.ws.transport.http.servlet.WSSpringServlet;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter
{
    @Bean
    public ServletRegistrationBean servletRegistrationBean()
    {
        return new ServletRegistrationBean(new WSSpringServlet(), "/PServices");
    }
    
    

}