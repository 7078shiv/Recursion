package Recursion;

public class CountSubsequence {
 static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		System.out.println("\n"+printandCountSubsequence(str,""));
		printandCountSubsequence1(str,"");
		System.out.println(count);
	}
	
	// 1 method
	public static void printandCountSubsequence1(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			count++;
			return;
			
		}
		printandCountSubsequence1(str.substring(1),ans);
		printandCountSubsequence1(str.substring(1),ans+str.charAt(0));
		
	}
	
	
	// 2 method;
	public static int printandCountSubsequence(String str,String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			return 1;
		}
		int c1=printandCountSubsequence(str.substring(1),ans);
		int c2=printandCountSubsequence(str.substring(1),ans+str.charAt(0));
		return c1+c2;
	}
}
