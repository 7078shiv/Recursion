package Recursion;

public class QueenCombination {

	public static void main(String[] args) {
		int n=4;
		int tq=2;
		boolean[] arr=new boolean[n];
		printanswer(arr,tq,0,"",0);
	}
	public static void printanswer(boolean[] board,int tq,int qpsf,String ans,int idx) {
		// queen placed so far;
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<board.length;i++) {
			
			if(board[i]==false) {
				board[i]=true;
				qpsf+=1;
				printanswer(board,tq,qpsf,ans+"b"+i+"q"+qpsf,i+1);
				// backtrack
				board[i]=false;
				qpsf-=1;
				
			}
		}
			

}
