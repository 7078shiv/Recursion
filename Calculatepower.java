package Recursion;

import java.util.Scanner;

public class Calculatepower {
	public static int power(int a,int b ) {
		if(b==0) {
			return 1;
		}
		int sa=power(a,b-1);
		return sa*a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(power(a,b));
	}
}
