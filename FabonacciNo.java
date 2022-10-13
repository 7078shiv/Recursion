package Recursion;

import java.util.Scanner;

public class FabonacciNo {
	public static int nthFabonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return nthFabonacci(n-1)+nthFabonacci(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(nthFabonacci(nthFabonacci(n)));
	}
}
