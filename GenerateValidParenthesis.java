package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateValidParenthesis {
	public static void print(int n,int open,int close,String ans) {
		if(open==n && close==n) {
			System.out.println(ans);
			return;
		}
		if(open<=n) {
			print(n,open+1,close,ans+"(");
		}
		if(close<open) {
			print(n,open,close+1,ans+")");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n,0,0,"");
		List<String> al=new ArrayList<>();
		leetcode_parenthesis(n,0,0,"",al);
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i));
		}
	}
	public static void leetcode_parenthesis(int n,int open,int close,String ans,List<String> ll){
		if(open==n && close==n) {
			//System.out.println(ans);
			ll.add(ans);
			return;
		}
		if(open<=n) {
			leetcode_parenthesis(n,open+1,close,ans+"(",ll);
		}
		if(close<open) {
			leetcode_parenthesis(n,open,close+1,ans+")",ll);
		}
	}
}
