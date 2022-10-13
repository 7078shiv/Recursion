package Recursion;

import java.util.Scanner;

public class JumpGame {
	public static int BoardPath(int src,int des,String ans)
	{
		int c=0;
		if(src==des) { 
			System.out.print(ans+" ");
			return 1;
		}
		if(src>des) {
			return 0;
		}
		for(int i=1;i<=3;i++) {
			c+=BoardPath(src+i,des,ans+i);
		}
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int des=4;
		System.out.println("\n"+BoardPath(0,des,""));
	}
}
