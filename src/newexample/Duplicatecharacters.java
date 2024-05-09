package newexample;

public class Duplicatecharacters {
	public static void main(String[] args) {
		String str = "Shree Gajanan";
		char[] carray=str.toCharArray();
		System.out.println("The string is : " +str);
		System.out.println("Duplicate Characters are : ");
		for(int i=0;i<str.length();i++) 
		{
			for(int j=i+1;j<str.length();j++) 
			{
				if(carray[i]==carray[j]) 
				{
					System.out.println(carray[j] + " ");
					break;
				}
			}
		}
	}

}
