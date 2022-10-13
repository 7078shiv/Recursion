package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PallindromePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Nitin";
		List<String> al=new ArrayList<>();
		List<List<String>> pans=new ArrayList<List<String>>();
		Partition(str,al,pans);
	for(int i=0;i<pans.size();i++) {
		for(int j=0;j<pans.get(i).size();j++)
			System.out.print(pans.get(i).get(j)+" ");
		System.out.println();
		}
	
	}
	public static void Partition(String que,List<String> list,List<List<String>> al) {
		if(que.length()==0) {
			//System.out.println(ans);
			al.add(new ArrayList<>(list));
			return;
		}
		for(int cut=1;cut<=que.length();cut++) {
			String s1=que.substring(0,cut);
			if(checkPallindrome(s1)) {
				list.add(s1);
			Partition(que.substring(cut),list,al);
			list.remove(list.size()-1);
			}
		}
	}
	public static boolean checkPallindrome(String str) {
		int s=0;
		int e=str.length()-1;
		while(s<e) {
			if(str.charAt(s)!=str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
