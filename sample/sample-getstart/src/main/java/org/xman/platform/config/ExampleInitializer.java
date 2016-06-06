package org.xman.platform.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;

import com.whenling.module.base.config.StaticConfigurationSupplier;

@Order(Ordered.LOWEST_PRECEDENCE)
public class ExampleInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		StaticConfigurationSupplier.prepend("config.properties");
	}

}