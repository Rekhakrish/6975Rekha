package string;
//String Compare by equals()method
public class Stringcomparison1 {
//String Equals method compares the original content pf the string.
	public static void main(String[] args) 
	{
		String s1="Virat";
		String s2="Virat";
		String s3=new String("Virat");
		String s4="Sachin";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

	}

}
