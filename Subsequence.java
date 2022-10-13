package Recursion;

import java.util.Scanner;

public class Subsequence {
	public static void printSubsequence(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		printSubsequence(str.substring(1),ans);
		printSubsequence(str.substring(1),ans+str.charAt(0));
	}
	public static void main(String[] args) {
		// TODO Auto-generated met hod stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		printSubsequence(str,"");
	}

}
