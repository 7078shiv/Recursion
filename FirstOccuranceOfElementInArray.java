package Recursion;

import java.util.ArrayList;

public class FirstOccuranceOfElementInArray {
public static int firstindes(int ele,int low,int high,int[] arr,ArrayList<Integer> al) {
	if(low>high) {
		return -1;
	}
	if(arr[low]==ele) {
		al.add(low);
		//return low;
	}
	return firstindes(ele,low+1,high,arr,al);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,7,3,3,7,6,3};
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println(firstindes(3,0,arr.length-1,arr,al));
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}
