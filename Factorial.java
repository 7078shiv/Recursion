package Recursion;

import java.util.Scanner;

public class Factorial {
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		int sa=fact(n-1);
		return sa*n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n));
	}

}
