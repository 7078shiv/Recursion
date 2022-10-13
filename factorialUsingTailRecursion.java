package Recursion;

import java.util.Scanner;

public class factorialUsingTailRecursion {
	public static int fact(int n,int ans) {
		if(n==0) {
			return ans;
		} 
		return fact(n-1,ans*n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(fact(n,1));
	}

}
