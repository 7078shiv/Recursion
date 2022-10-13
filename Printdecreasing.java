package Recursion;

import java.util.Scanner;

public class Printdecreasing {
	public static void print(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		print(n-1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);
	}

}
