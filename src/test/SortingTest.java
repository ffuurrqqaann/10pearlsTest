package test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.tenpearls.test.Sorting;

public class SortingTest {

	@Test
	public void returnedArrayShouldBeEmptyIfTheProvidedArrayIsEmptyTest() {
		
		Integer[] numbersArr = {};
		
		assertTrue(Sorting.oddEvenSort(numbersArr).length==0);
	}
	
	@Test
	public void arrayShouldHaveEqualLengthAndValuesAfterSortingTest() {
		
		Integer[] actualNumbersArr = {5,8,9,6,4,7,9,3,2,1,1,1};
		Integer[] expectedNumbersArr = {1,1,1,3,5,7,9,9,2,4,6,8};
		
		assertEquals(Sorting.oddEvenSort(actualNumbersArr).length, 12);
		assertArrayEquals(Sorting.oddEvenSort(actualNumbersArr), expectedNumbersArr);
	}
	
	@Test
	public void skipZeroAndNotToAddInResultedArray() {
		
		Integer[] actualNumbersArr = {5,8,9,6,4,7,9,0,3,2,1,1,1};
		Integer[] expectedNumbersArr = {1,1,1,3,5,7,9,9,2,4,6,8};
		
		assertEquals(Sorting.oddEvenSort(actualNumbersArr).length, 12);
		assertArrayEquals(Sorting.oddEvenSort(actualNumbersArr), expectedNumbersArr);
	}
	
	@Test
	public void allZerosTest() {

		Integer[] numbersArr = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		assertEquals(Sorting.oddEvenSort(numbersArr).length, 0);
		
	}
	
	@Test
	public void allOnesTest() {
		Integer[] numbersArr = {1,1,1,1,1,1,1,1,1,1,1,1,1};
		
		assertEquals(Sorting.oddEvenSort(numbersArr).length, 13);
	}

}
