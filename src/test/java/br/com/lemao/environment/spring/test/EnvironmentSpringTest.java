package br.com.lemao.environment.spring.test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.lemao.environment.annotation.GivenEnvironment;
import br.com.lemao.environment.spring.junit.EnvironmentSpringRule;
import br.com.lemao.environment.spring.test.environment.BikerUtils;
import br.com.lemao.environment.spring.test.environment.FooEnvironment;
import br.com.lemao.environment.spring.test.model.LemaoBiker;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnvironmentSpringTest {

	@Rule
	public EnvironmentSpringRule environmentSpringRule = new EnvironmentSpringRule();

	@Autowired
	private LemaoBiker lemaoBiker;

	@Test
	@GivenEnvironment(FooEnvironment.class)
	public void test() {
		Assert.assertEquals(1234L, lemaoBiker.getId().longValue());
		Assert.assertEquals("Lemão", lemaoBiker.getName());
		Assert.assertFalse(BikerUtils.getBikers().isEmpty());
		Assert.assertEquals(2, BikerUtils.getBikers().size());
	}

}
