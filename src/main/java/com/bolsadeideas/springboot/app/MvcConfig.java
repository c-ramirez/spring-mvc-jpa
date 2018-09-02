package com.bolsadeideas.springboot.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{

//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		super.addResourceHandlers(registry);
//		String resourcePath = Paths.get("uploads").toAbsolutePath().toUri().toString();
//		
//		registry.addResourceHandler("/uploads/**")
//		.addResourceLocations(resourcePath);
//	}
	 
}
