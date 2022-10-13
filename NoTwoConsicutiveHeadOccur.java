package Recursion;

import java.util.Scanner;

public class NoTwoConsicutiveHeadOccur {
	public static int print(int n,String ans) {
		int f1=0;
		if(n==0) {
			System.out.println(ans);
			return 1;
		}
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
		 f1=print(n-1,ans+"H");
		}
		int f2=print(n-1,ans+"T");
		return f1+f2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(print(n,""));
		}
	}


