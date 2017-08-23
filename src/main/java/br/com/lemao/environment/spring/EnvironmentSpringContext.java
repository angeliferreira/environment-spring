package br.com.lemao.environment.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentSpringContext implements ApplicationContextAware {

	private static ApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	public static <T> T getBean(Class<T> clazz) {
		return getApplicationContext().getBean(clazz);
	}

	public static ApplicationContext getApplicationContext() {
		return context;
	}
	public static void setApplicationContextStatic(ApplicationContext applicationContext) {
		context = applicationContext;
	}

}
