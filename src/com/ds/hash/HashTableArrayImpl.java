package com.ds.hash;

public class HashTableArrayImpl {

	public static void main(String[] args) {
		HashTableArray<String> hm = new HashTableArray<String>(10);
		hm.put(10, "Vivek");
		hm.put(11, "pallavi");
		hm.put(12, "susmita");
		hm.put(13, "pratik");

		System.out.println(hm.get(10));
		System.out.println(hm.get(9));
		System.out.println(hm.get(13));
	}

}
