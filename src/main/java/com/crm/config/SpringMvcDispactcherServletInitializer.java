package com.crm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class SpringMvcDispactcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}