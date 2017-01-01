package com.example;

import controller.MemoTourCotroller;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.codehaus.xfire.transport.http.XFireConfigurableServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 张志强
 * @version v0.1 2017/1/1.
 */
@Configuration
public class AppConfig  {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, new MemoTourCotroller());
        endpoint.publish("/TourMemo");
        return endpoint;
    }
}
