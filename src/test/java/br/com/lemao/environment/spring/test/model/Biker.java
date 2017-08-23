package br.com.lemao.environment.spring.test.model;

import org.springframework.stereotype.Component;

@Component
public abstract class Biker {

	private Long id;
	private String name;
	
	public Biker() {}
	
	public Biker(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
