package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		_00_LinearSearch ls = new _00_LinearSearch();
		String[] a = {"a", "b", "c", "d"};
		String[] b = {"e", "f", "g", "h"};
		String[] c = {"i", "j", "k", "l"};
		//1. use the assertEquals method to test your linear search method.
		assertEquals(ls.linearSearch(a, "c"), 2);
		assertEquals(ls.linearSearch(b, "a"), -1);
		assertEquals(ls.linearSearch(c, "i"), 0);
	}

	@Test
	public void testBinarySearch() {
		_01_BinarySearch bs = new _01_BinarySearch();
		int[] a = {1, 3, 5, 7};
		int[] b = {2, 4, 6, 9};
		int[] c = {1, 2, 4, 5};
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		assertEquals(bs.binarySearch(a, 0, 2, 3), 1);
		assertEquals(bs.binarySearch(b, 1, 0, 0), -1);
		assertEquals(bs.binarySearch(c, 0, 3, 3), -1);
	}
	
	@Test
	public void testInterpolationSearch() {
		_02_InterpolationSearch is = new _02_InterpolationSearch();
		int[] a = {3, 6, 9, 12};
		int[] b = {4, 8, 12, 16};
		int[] c = {100, 201, 300, 400};
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(is.interpolationSearch(a, 9), 2);
		assertEquals(is.interpolationSearch(b, 23), -1);
		assertEquals(is.interpolationSearch(c, 3), -1);
	}
	
	@Test
	public void testExponentialSearch() {
		_03_ExponentialSearch es = new _03_ExponentialSearch();
		int[] a = {1, 2, 3, 4};
		int[] b = {1, 3, 4, 5};
		int[] c = {1, 2, 1, 3};
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		assertEquals(es.exponentialSearch(a, 2), 1);
		assertEquals(es.exponentialSearch(b, 2), -1);
		assertEquals(es.exponentialSearch(c, 2), -1);
	}
}
