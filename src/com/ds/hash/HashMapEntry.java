package com.ds.hash;

public class HashMapEntry {

	int key;
	Object value;
	
	HashMapEntry next;

	public HashMapEntry() {
		next = null;
	}

	public HashMapEntry(int key, Object value) {
		next = null;
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public Object getValue() {
		return value;
	}
	
	

}
