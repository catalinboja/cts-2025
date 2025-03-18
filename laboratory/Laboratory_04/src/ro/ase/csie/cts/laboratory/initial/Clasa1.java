package ro.ase.csie.cts.laboratory.initial;

public class Clasa1 {
	
	public float Computes(int t, float s, int period)
	  {
	    float result = 0;
	    float value = (period > 10) ? (float)15/100 : (float)period/100; 
	    if (t == 1)
	    {
	      result = s;
	    }
	    else if (t == 2)
	    {
	      result = (s - (0.1f * s)) - value * (s - (0.1f * s));
	    }
	    else if (t == 3)
	    {
	      result = (s - (0.25f * s)) - value * (s - (0.25f * s));
	    }
	    else if (t == 4)
	    {
	      result = (s - (0.35f * s)) - value * (s - (0.35f * s));
	    }
	    return result;
	  }
}
