package com.tenpearls.test;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[] nums = new Integer[] {1,2,4,3,7,16};
		nums = Sorting.oddEvenSort(nums);
		
		Sorting.printArray(nums);
	}

}
