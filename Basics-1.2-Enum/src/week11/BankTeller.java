package week11;

public class BankTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sterling = 189; 
		int fifties, twenties, tens, fives, ones; //try different values to check your code
		
		fifties = sterling / 50;
		sterling = sterling % 50;
		
		twenties = sterling / 20;
		sterling = sterling % 20;
		
		tens = sterling / 10;
		sterling = sterling % 10;
		
		fives = sterling / 5;
		sterling = sterling % 5;

		ones = sterling;
		
		System.out.println("50's: " + fifties);
		System.out.println("20's: " + twenties);
		System.out.println("10's: " + tens);
		System.out.println("5's: " + fives);
		System.out.println("1's: " + ones);
		
	}

}
