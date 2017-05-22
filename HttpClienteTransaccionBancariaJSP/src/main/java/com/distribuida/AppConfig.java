package com.distribuida;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;


@Configuration
@ComponentScan("com.edu")
public class AppConfig {
	
	@Bean("transaccionBancaria")
	public HttpInvokerProxyFactoryBean servicioOperaciones(){
		HttpInvokerProxyFactoryBean proxy = new HttpInvokerProxyFactoryBean();
		proxy.setServiceUrl("http://localhost:9090/transaccionBancaria");
		proxy.setServiceInterface(TransaccionBancaria.class);
		return proxy;
	}
	
	@Bean
	public ServletRegistrationBean adminServletRegistrationBean() {
	    return new ServletRegistrationBean(new Servlet(), "/inicio");
	}
	
	@Bean
	public ServletRegistrationBean transaccionServletRegistrationBean() {
	    return new ServletRegistrationBean(new TransaccionBancariaServlet(), "/proceso");
	}

}
