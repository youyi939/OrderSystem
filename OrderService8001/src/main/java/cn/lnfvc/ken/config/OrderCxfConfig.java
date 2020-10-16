package cn.lnfvc.ken.config;

import cn.lnfvc.ken.service.OrderService;
import cn.lnfvc.ken.service.impl.OrderServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/16 8:09 下午
 */

@Configuration
public class OrderCxfConfig {

    @Bean("dispatcherServletCxf")
    public ServletRegistrationBean dispatcherServlet(){
        return new ServletRegistrationBean(new CXFServlet(),"/webService/orderService/*");//发布服务名称
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), orderService());
        endpoint.publish("/demo");
        return endpoint;
    }

}
