package week17;

public class portfolio6Functions {

	public int test(int[] input) {
		
		for (int i = 0; i < input.length; i++)
		{
			float interestRate = 0;
			if (input [i] >= 1 && input[i] <= 1000)
			{	
				interestRate = (float) 1.005;
			}
			else if (input[i] >= 1001 && input[i] <= 10000)
			{
				interestRate = (float) 1.015;
			}
			else if (input[i] >= 10001 && input[i] <= 50000)
			{
				interestRate = (float) 1.025;
			}
			else
			{
				return -999;
			}
			
			if (input[i + 1] < 1 || input[i + 1] > 10)
			{
				return -999;
			}
			
			int deposit = input [i];
			int years = input[i + 1];
			return (int) Math.round(deposit * Math.pow(interestRate, years));
		}
		
		return 0; 
	}

}
