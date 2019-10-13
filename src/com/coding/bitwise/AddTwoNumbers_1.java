/**
 * Write a function that add two numbers A and B.

Example
Example 1:

Input:  a = 1, b = 2
Output: 3	
Explanation: return the result of a + b.
Example 2:

Input:  a = -1, b = 1
Output: 0	
Explanation: return the result of a + b.
Challenge
Of course you can just return a + b to get accepted. But Can you challenge not do it like that?(You should not use + or any arithmetic operators.)

Clarification
Are a and b both 32-bit integers?

Yes.
Can I use bit operation?

Sure you can.

 */
package com.coding.bitwise;

public class AddTwoNumbers_1 {

	public static void main(String[] args) {
		int sum = aplusb(4, 5);
		System.out.println(sum);

	}

	/**
	 * @param a: An integer
	 * @param b: An integer
	 * @return: The sum of a and b
	 */
	public static int aplusb(int a, int b) {

		while (b != 0) {
			int carry = a & b;

			a = a ^ b;

			b = carry << 1;
		}

		return a;
	}
}
