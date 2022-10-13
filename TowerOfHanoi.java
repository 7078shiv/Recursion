package Recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		printstep(n,"A","B","C");
	}
	public static void printstep(int n,String s,String h,String d) {
		// TODO Auto-generated method stub
		// s--->source rod
		// d--->destination rod
		// h-->helper rod
		if(n==0) {
			return;
		}
		printstep(n-1,s,d,h);
		System.out.println("move "+n+"th disk "+s+" to "+d+" "+"using "+h);
		printstep(n-1,h,s,d);
	}
	
}
