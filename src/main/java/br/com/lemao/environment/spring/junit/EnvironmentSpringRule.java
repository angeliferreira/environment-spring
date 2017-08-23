package br.com.lemao.environment.spring.junit;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import br.com.lemao.environment.junit.EnvironmentStatement;
import br.com.lemao.environment.spring.factory.EnvironmentSpringFactory;

public class EnvironmentSpringRule implements TestRule {

	public Statement apply(Statement statement, Description description) {
		return new EnvironmentStatement(statement, description, new EnvironmentSpringFactory());
	}

}
