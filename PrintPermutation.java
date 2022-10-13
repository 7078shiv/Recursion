package Recursion;

import java.util.Scanner;

public class PrintPermutation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		print(str,"");
	}
	public static void print(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			String temp=str.substring(0,i)+str.substring(i+1);
			print(temp,ans+str.charAt(i));
		}
	}
}
