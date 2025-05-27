package ro.ase.cts.unit.testing;

public class MathLibrary {
	public static int addNumbers(int a, int b) {
		if(a == Integer.MAX_VALUE || b == Integer.MAX_VALUE)
			throw new UnsupportedOperationException();
		return a + b;
	}
}
