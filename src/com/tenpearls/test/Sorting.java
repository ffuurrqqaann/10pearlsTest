package com.tenpearls.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static Integer[] oddEvenSort(Integer[] numbers) {
		if(numbers.length<=0) {
			System.out.println("Array cannot be empty.");
			
			return new Integer[]{};
		}
		
		List<Integer> evenNumbers = new ArrayList<Integer>();
		List<Integer> oddNumbers = new ArrayList<Integer>();
		
		for(int i=0;i<numbers.length;i++) {
			
			// As 0 is not an even nor an odd number so skipping it from the sorting process.
			if(numbers[i]==0) { 
				continue;
			}
			
			if(isNumberOdd(numbers[i])) {
				oddNumbers.add(numbers[i]);
			} else {
				evenNumbers.add(numbers[i]);
			}
		}
		
		Collections.sort(evenNumbers);
		Collections.sort(oddNumbers);
		
		Integer[] sortedNums = new Integer[oddNumbers.size()+evenNumbers.size()];
		oddNumbers.addAll(evenNumbers);		
		
		return oddNumbers.toArray(sortedNums);
	}
	
	private static Boolean isNumberOdd(int num) {
		if(num%2==0)
			return false;
		
		return true;
	}
	
	public static void printList(List<Integer> list) {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
			System.out.print(" ");
		}
	}
	
	public static void printArray(Integer[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}

	
}
