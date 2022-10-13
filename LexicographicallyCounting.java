package Recursion;

public class LexicographicallyCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
		printLexicographically(n,0);
	}
	public static void printLexicographically(int n,int curr) {
		if(curr>n) {
			return;
		}
		
		System.out.println(curr);
		int i=0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			printLexicographically(n,curr*10+i);
		}
	}
}
