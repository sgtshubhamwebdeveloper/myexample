package newexample;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "Abcd",reverseStr="";
		int strLength=str.length();
		for(int i=(strLength-1);i>=0;--i) 
		{
			reverseStr = reverseStr+str.charAt(i);
		}
		if(str.toLowerCase().equals(reverseStr.toLowerCase())) 
		{
			System.out.println(str + "is Palindrome String.");
		}
		else {
			System.out.println(str+ " is not Palindrome String.");
		}
	}

}
