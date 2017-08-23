package br.com.lemao.environment.spring.junit;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.lemao.environment.spring.EnvironmentSpringContext;

public class EnvironmentSpringRunner extends SpringJUnit4ClassRunner {

	public EnvironmentSpringRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
		EnvironmentSpringContext.setApplicationContextStatic(getTestContextManager().getTestContext().getApplicationContext());
	}

}
