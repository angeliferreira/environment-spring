package br.com.lemao.environment.spring.factory;

import br.com.lemao.environment.factory.EnvironmentFactory;
import br.com.lemao.environment.spring.EnvironmentSpringContext;

public class EnvironmentSpringFactory implements EnvironmentFactory {

	public <T> T create(Class<T> clazz) {
		return EnvironmentSpringContext.getBean(clazz);
	}

}
