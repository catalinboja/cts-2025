package cts.csie.ase.ro.patterns.state;

public class TestState {

	public static void main(String[] args) {

		Hero superman = new Hero("Superman");
		superman.move(10);
		
		superman.getAHit(30);
		superman.move(10);
		
		superman.getAHit(30);
		superman.move(10);
		
		superman.heal(100);
		superman.move(10);
		
		superman.getAHit(50);
		superman.move(10);
	}

}
