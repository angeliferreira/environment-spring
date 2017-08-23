package br.com.lemao.environment.spring.test.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.lemao.environment.annotation.Environment;
import br.com.lemao.environment.spring.test.model.Biker;
import br.com.lemao.environment.spring.test.model.LemaoBiker;

@Environment
@Component
public class FooEnvironment {
	
	@Autowired
	private LemaoBiker lemaoBiker;
	
	public void run() {
		BikerUtils.add(new Biker(654L, "João") {});
		BikerUtils.add(lemaoBiker);
	}

}
