package br.com.lemao.environment.spring.test.model;

import org.springframework.stereotype.Component;

@Component
public class LemaoBiker extends Biker {
	
	@Override
	public Long getId() {
		return 1234L;
	}
	
	@Override
	public String getName() {
		return "Lemão";
	}
	
}
