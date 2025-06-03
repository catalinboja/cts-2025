package ro.ase.cts.unit.testing;

import ro.ase.cts.unit.testing.exceptions.NoValuesException;
import ro.ase.cts.unit.testing.exceptions.NullValuesException;

public class MathLibrary {
	
	public static int minimumValue(int[] values) {
		
		if(values == null)
			throw new NullValuesException();
		
		if(values.length == 0) {
			throw new NoValuesException();
		}
		
		int min = values[0];
		for(int value : values) {
			if(min > value)
				min = value;
		}
		return min;
	}
	
}
