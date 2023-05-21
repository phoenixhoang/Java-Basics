package week20;

public class Main {
	public static void main(String args[]) {

		// some tests of the reverse method (StringUtils class)
		String[] testCases = { "abcd", "Abcd", "-$%$", "", "Abba" };
		for (int i = 0; i < testCases.length; i++) {
			System.out.println("Reverse of " + testCases[i] + " is " + StringUtils.reverse(testCases[i]));
		}

		// some tests of the toLower method (StringUtils class)
		for (int i = 0; i < testCases.length; i++) {
			System.out.println("ToLower of " + testCases[i] + " is " + StringUtils.toLower(testCases[i]));
		}

		// some tests of the equals method (StringUtils class)
		String s1, s2;
		s1 = "asdfg";
		s2 = "";
		System.out.println(s1 + " = " + s2 + "? " + StringUtils.equals(s1, s2));
		
		s1 = "asdfg";
		s2 = "ASDFG";
		System.out.println(s1 + " = " + s2 + "? " + StringUtils.equals(s1, s2));
		
		s1 = "qwerty!£$%";
		s2 = "qwerty!£$%";
		System.out.println(s1 + " = " + s2 + "? " + StringUtils.equals(s1, s2));
		
		s1 = "";
		s2 = "";
		System.out.println(s1 + " = " + s2 + "? " + StringUtils.equals(s1, s2));

		// some tests of the isPalindrome method (StringUtils class)
		for (int i = 0; i < testCases.length; i++) {
			System.out.println("Palindrome: " + testCases[i] + " is " + StringUtils.isPalindrome(testCases[i]));
		}
	}
}
