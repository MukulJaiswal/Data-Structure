package com.complexity;

public class ComplexityAnalysis {

	/**
	 * for(i=0; i < N; i++) { statement; }
	 * 
	 * Complexity :O(n)
	 */
	//------------------------------------------------------------
	/**
	 * for(i=0; i < N; i++) 
	 * {
	 *  for(j=0; j < N;j++) 
	 *  { statement; }
	 *  }
	 *  
	 *  Complexity :O(n^2)
	 */
	//------------------------------------------------------------
	/**
	 * for(int i=0;i<n;i/=2)
	 * 
	 * Complexity :O(log n)
	 */
	//------------------------------------------------------------
	/**
	 * for(int i=0;i<n;i=i*2){
	 * }
	 * Complexity :O(log n)
	 */
	//------------------------------------------------------------
	/**
	 * for(int i=0;i<n;i++)
	 * {
	 * 	for(int j=0;j<n;j=j+2)
	 * 	{
	 * 	}
	 * }
	 * Complexity : O(n*log(n) )
	 *
	 */
	//------------------------------------------------------------
	/**
	 * Goodness of complexity
	 * O(log(n)) or O(1)  (Best)
	 * O(n)
	 * O(n*log(n))
	 * O(n^2)
	 * O(2^n)
	 * O(n!)  (Worst)
	 */
	
	/**
	 * Complexity Chart of All Sorting algorithms:
	 * 
	 * https://www.hackerearth.com/practice/notes/sorting-and-searching-algorithms-time-complexities-cheat-sheet/
	 */
}







