package com.souvik.ds.array;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		 
		int[] arr = new int[] {1,2,4,6,8};
		int low =0;
		int high = arr.length-1;

		
		while (low < high) {
			int tmp = arr[low];
			arr[low] = arr[high];
			arr[high] = tmp;
			low++;
			high--;
		}
		
		Arrays.stream(arr).forEach(data -> System.out.println(data));

	}

}
