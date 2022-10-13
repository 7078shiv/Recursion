package Recursion;

public class LetterPossiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABAC";
		int[] freq=new int[26];
		for(int i=0;i<str.length();i++) {
			int idx=str.charAt(i)-'A';
			freq[idx]++;
		}
		for(int i=0;i<freq.length;i++) {
			System.out.print(freq[i]+" ");
		}
	}

}
