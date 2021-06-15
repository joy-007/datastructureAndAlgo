package com.souvik.ds.array;

public class ArrayMaxMinNumber {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10,2,4,16,8,-1,12,29,21};
		int low =0;
		int high = arr.length-1;
		int min = arr[low];
		int max = arr[low];
		
		while(low<=high) {
			
			if(max<arr[low]) {
				max = arr[low];
			}else if(min>arr[low]) {
				min = arr[low];
			}
			low++;
		}
    System.out.println("Max val::" + max);
    System.out.println("Min val::" + min);

	}

}
