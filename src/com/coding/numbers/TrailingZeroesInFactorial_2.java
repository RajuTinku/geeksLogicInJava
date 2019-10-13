/**
 * Write an algorithm which computes the number of trailing zeros in n factorial.

Example
Example 1:
	Input:  11
	Output: 2
	
	Explanation: 
	11! = 39916800, so the output should be 2

Example 2:
	Input:  5
	Output: 1
	
	Explanation: 
	5! = 120, so the output should be 1.

Challenge
O(log N) time
 */
package com.coding.numbers;

public class TrailingZeroesInFactorial_2 {

	public static void main(String[] args) {
		try {
			System.out.println(trailingZeros(11));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	 /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public static long trailingZeros(long n) throws Exception{
    	
    	if ( n < 0) {
    		throw new Exception("Positive numbers only");
    	}
    	
    	if(n < 5 ) {
    		return 0;
    	}
    	
    	long trailingZeroes = 0;
    	
    	while(n/5 != 0) {
    		trailingZeroes += n/5;
    		n /= 5;
    	}
    	
    	return trailingZeroes;
    	
    }

}
