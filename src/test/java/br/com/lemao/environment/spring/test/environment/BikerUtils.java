package br.com.lemao.environment.spring.test.environment;

import java.util.ArrayList;
import java.util.List;

import br.com.lemao.environment.spring.test.model.Biker;

public class BikerUtils {

	private static List<Biker> bikers = new ArrayList<Biker>();
	
	public static void add(Biker biker) {
		getBikers().add(biker);
	}

	public static List<Biker> getBikers() {
		return bikers;
	}

}
