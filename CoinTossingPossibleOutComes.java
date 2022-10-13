package Recursion;

import java.util.Scanner;

public class CoinTossingPossibleOutComes {
	public static int print(int n,String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return 1;
		}
		int  f1=print(n-1,ans+"H");
		int f2=print(n-1,ans+"T");
		return f1+f2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(print(n,""));
		}
}
