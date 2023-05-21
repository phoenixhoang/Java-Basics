package week17;
public class portfolio6Test {
	
	static portfolio6Functions functions;
	
	public static void test() 
	{
		int [][] input = {{1, 1}, {1000, 10}, {1001, 1}, {10000, 10}, {10001, 5}, {50000, 10}, {0, 1}, {50001, 10}, {1000, 0}, {1000, 11}};
		int [] output = {1, 1051, 1016, 11605, 11315, 64004, -999, -999, -999, -999, -999};
		int numTestCases = input.length;
		System.out.println("***********\nTesting Interest ");
		int passed = 0;
		int error = -999;
		for ( int i = 0; i < numTestCases; i++ )
		{
			int result = functions.test(input[i]);
			if ( result != output[i] )
			{
				System.out.println("Test "+i+" failed. Expected "+output[i]+" got "+result);
			}
			else
			{
				passed++;
				System.out.println("Test "+i+" passed!");
			}
		}
		System.out.println("Finished testing Average - passed "+passed+" out of "+numTestCases);
	}
	
	public static void main( String args[] )
	{
		functions = new portfolio6Functions();
		test();

	}
}
