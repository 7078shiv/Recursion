package Recursion;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateCharInPermutation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		print(str,"");
	}
	public static void print(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		//HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			String temp=str.substring(0,i)+str.substring(i+1);
			//if(!(hs.contains(str.charAt(i))))
			int f=0;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					f=1;
					break;
				}
			}
			if(f==0)
			print(temp,ans+str.charAt(i));
		//	hs.add(str.charAt(i));
		}
	}

}
