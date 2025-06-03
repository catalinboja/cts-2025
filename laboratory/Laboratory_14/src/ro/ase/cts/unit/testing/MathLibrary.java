package ro.ase.cts.unit.testing;

import java.util.Arrays;

import ro.ase.cts.unit.testing.exceptions.NoValuesException;
import ro.ase.cts.unit.testing.exceptions.NullValuesException;

public class MathLibrary {
	
	private static int[] cachedData;
		
	
	public static int[] getCachedData() {
		//return cachedData;
		return Arrays.copyOf(cachedData, cachedData.length);
	}


	public static void setCachedData(int[] cachedData) {
		// initial shallow copy
		// MathLibrary.cachedData = cachedData;
		MathLibrary.cachedData = 
				Arrays.copyOf(cachedData, cachedData.length);
	}


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
