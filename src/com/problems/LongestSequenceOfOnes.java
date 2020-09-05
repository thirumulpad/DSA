package com.problems;
import java.util.ArrayList;
import java.util.List;

public class LongestSequenceOfOnes {

	public static void main(String[] args) {
		
		int[] array = {1,1,0,1,1,1,0,1,1,0,1};
		List<Integer> list = new ArrayList<Integer>();
		int sequenceOfOnesTotal =0;
		for (int i=0; i<array.length;i++) {
			if(array[i] == 1) {
				sequenceOfOnesTotal++;
				if(sequenceOfOnesTotal>0 && i==array.length-1) {
					list.add(sequenceOfOnesTotal);
				}
			}else{
				if(sequenceOfOnesTotal>0) {
					list.add(sequenceOfOnesTotal);
				}
				list.add(array[i]);
				sequenceOfOnesTotal = 0;
			}
		}
		System.out.println("list : "+list);
		
		int maxsequence = 0;
		for(int i=0; i<list.size();i+=2) {
			int len = list.get(i);
			if(i+1 < list.size()) {
				len+=1;
			}
			if(i+2 < list.size()) {
				len += list.get(i+2);
			}
			if(len>maxsequence)
				maxsequence=len;
		}
		System.out.println("maxSequence : "+maxsequence);
	}

}
