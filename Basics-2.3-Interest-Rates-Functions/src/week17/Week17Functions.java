package week17;

class Week17Functions
{				// 0   1  2   3  4  5
	//input array [23][5][34][3][4][2]
	int average( int [] inputArray )
	{
		// empty array should return an average of zero
		if (inputArray.length ==0)
		{
			return 0;
		}
		
		// return the integer average of the values in inputArray
		int total = 0; //sum of all values
		for (int i = 0; i < inputArray.length; i++)
		{
			total += inputArray[i];
		}
		return total / (inputArray.length);
	}

	float range( float [] inputArray )
	{
		// return the difference between the largest and smallest values in
		// inputArray. Empty array returns zero. All input values lie between
		// -1000.0f and 1000.0f
		if (inputArray.length ==0)
		{
			return 0.0f;
		}
		
		float max = -10000;
		float min = 10000;
		for (int i = 0; i < inputArray.length; i++)
		{
			if (max < inputArray[i])
			{
				max = inputArray[i];
			}
			
			if (min > inputArray[i])
			{
				min = inputArray[i];
			}
		}
		return max - min;
		//return 0.0f;
	}

	int collatz( int n )
	{
		// if n is even, return n/2, otherwise return 3*n + 1
		int m = n % 2;
		if (m == 0)
		{
			return n/2;
		}
		else
		{
			return 3*n + 1;
		}
		//return 0;
	}

	int compoundInterest( int capital, int ratePC, int years )
	{
		// return the new capital if compound interest at ratePC % per year is accumulated
		// by an integer amount (capital) over an integer number of years (years).
		// return value is rounded to *nearest* integer
		float ratePCfloat = ratePC;
		float ratePC2 = 1 + (ratePCfloat / 100);
		return (int) Math.round(capital * Math.pow(ratePC2, years));
		//return 0;
	}
}
