package com.ds.hash;

public class HashTableArray<T> {

	HashMapEntry[] arrayHash;
	int size;

	public HashTableArray(int size) {
		this.size = size;
		arrayHash = new HashMapEntry[size];
		for (int i = 0; i < arrayHash.length; i++) {
			arrayHash[i] = new HashMapEntry();
		}
	}

	public int getHash(int key) {
		return key % size;
	}

	public void put(int key, Object value) {
		int hashIndex = getHash(key);
		HashMapEntry arrayValue = arrayHash[hashIndex];
		HashMapEntry newEntry = new HashMapEntry(key, value);

		newEntry.next = arrayValue.next;
		arrayValue.next = newEntry;
	}

	public T get(int key) {
		T value = null;
		int hashIndex = getHash(key);
		HashMapEntry arrayValue = arrayHash[hashIndex];

		while (arrayValue != null) {
			if (arrayValue.getKey() == key) {
				value = (T) arrayValue.getValue();
				break;
			} else
				arrayValue = arrayValue.next;
		}

		return value;
	}
}
