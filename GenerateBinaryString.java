package Recursion;

public class GenerateBinaryString {
	static int c=0;
	public static void print(String str,String ans) {
		if(str.length()==0) {
			c++;
			System.out.print(ans+" ");
			return;
		}
		
		if(str.charAt(0)=='?') {
		print(str.substring(1),ans+0);
		print(str.substring(1),ans+1);
		}
		else {
			print(str.substring(1),ans+str.charAt(0));
		}
	}
	public static void main(String[] args) {
	String str="1??0?101";
	print(str,"");
	
	System.out.println(c);
	}
}


//10000101 10001101 10100101 10101101 11000101 11001101 11100101 11101101