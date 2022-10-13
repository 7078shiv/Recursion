package Recursion;

public class Print_path {

	public static void main(String[] args) {
		int m=3;
		int n=3;
		printpath(m-1,n-1,0,0,"");
	}
	public static void printpath(int re,int ce,int cr,int cc,String ans) {
		if(cr==re && cc==ce) {
			System.out.println(ans);
			return;
		}
		if(cr>re || cc>ce) {
			return;
		}
		
		printpath(re,ce,cr,cc+1,ans+"H");
		printpath(re,ce,cr+1,cc,ans+"V");
	}
}
