package week11;

public class BankTellerFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float sterling = 26.11f;  //try different values to check
		int intSterling;
		float fifties, twenties, tens, fives, ones, fiftyP, twentyP, tenP, fiveP, oneP; //try different values to check code
		
		intSterling = (int)sterling; //keep the integer part
		sterling = (float)(sterling - intSterling); //0.11
		oneP = (int)(sterling * 100.0f); //multiply by 100 to be whole pence
		
		fifties = intSterling / 50;
		intSterling = intSterling % 50 ;
		
		twenties = intSterling / 20;
		intSterling = intSterling % 20 ;
		
		tens = intSterling / 10;
		intSterling = intSterling % 10 ;
		
		fives = intSterling / 5;
		sterling = intSterling % 5 ;
		
		ones = intSterling;
		sterling = intSterling;
		
		fiftyP = oneP/ 50;
		oneP = oneP % 50;
		twentyP = oneP / 20;
		oneP = oneP % 20;
		tenP = oneP / 10;
		oneP = oneP % 10;
		fiveP = oneP / 5;
		oneP = oneP % 5;
		
		System.out.println("5's: " + fifties);
		System.out.println("20's: " + twenties);
		System.out.println("10's: " + tens);
		System.out.println("5's: " + fives);
		System.out.println("5's: " + ones);
		System.out.println("1p's: " + oneP);
	}

}
