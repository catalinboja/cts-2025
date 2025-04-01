package ro.ase.csie.cts.design.patterns.builder.separate;

public class TestBuilder {

	public static void main(String[] args) {
		
		Hero hero = new HeroBuilder("Batman").build();
	}

}
