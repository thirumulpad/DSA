package com.searching;

public class InterpolationSearch {

	public static void main(String[] args) {
		DataSet data = new DataSet(100000);
		int search = 99999;
		boolean isFound = false;

		int low = 0;
		int high = data.getSize() - 1;

		int mid = 0;
		while (!isFound) {

//			mid = low + ((high - low) / 2); this is for binary search
			mid = low + ((high - low) / (data.data[high] - data.data[low])) * (search - data.data[low]);
			data.numberTry++;
			if (low > high) {
				System.out.println("number is not found");
				break;
			}
			if (data.data[mid] == search) {
				System.out.println("element " + search + " found after " + data.numberTry + " tries");
				isFound = true;
				break;
			}
			if (data.data[mid] < search) {
				low = mid + 1;
			}
			if (data.data[mid] > search) {
				high = mid - 1;
			}
		}

	}

}
