package week20;

public class StringUtils
{
	// using the comments provided, implement the four methods below
	
	//   0  1  2  3
	//s [a][b][c][d]
	//o [d][c][b][a]
	public static String reverse( String s )
	{
		String out = "";
		//s.charAt(index)
		//s.length();
		
		for (int i = 0; i < s.length(); i++)
		{
			out = out + s.charAt(s.length() - 1 - i);
		}
		
		// return a new string, which is the String s, reversed
		return out;
	}

	public static String toLower( String s )
	{
		// return a new string, which is the same as s, but
		// all upper-case alphabetical characters are replaced by their
		// lower-case equivalents
		
		//String out = s.toLowerCase();
		
		String out = "";
		
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
			{
				ch = (char) (ch + 32);
			}
			
			out = out + ch;
		}
		
		return out;
	}

	public static boolean equals( String s1, String s2 )
	{
		// return true if s1 and s2 contain the same characters.
//		if (s1.equals(s2))
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
		if (s1.length() != s2.length())
		{
			return false;
		}
		else 
		{
			for (int i = 0; i < s1.length(); i++)
			{
				if (s1.charAt(i) != s2.charAt(i))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isPalindrome( String s )
	{
		// return true if s reads the same forwards and backwards, ignoring case
		//s.charAt(index)
		//s.length();
		
		String out = "";
		
		for (int i = 0; i < s.length(); i++)
		{
			out = out + s.charAt(s.length() - 1 - i);
		}

		out = out.toLowerCase();
		s = s.toLowerCase();
		
		if (s.equals(out))
			return true;
		else
			return false;
	}
}
