/**
 * Given a string(Given in the way of char array) and an offset, rotate the string by offset in place. (rotate from left to right).

Example 1:

Input: str="abcdefg", offset = 3
Output: str = "efgabcd"	
Explanation: Note that it is rotated in place, that is, after str is rotated, it becomes "efgabcd".

Example 2:
Input: str="abcdefg", offset = 0
Output: str = "abcdefg"	
Explanation: Note that it is rotated in place, that is, after str is rotated, it becomes "abcdefg".

Example 3:
Input: str="abcdefg", offset = 1
Output: str = "gabcdef"	
Explanation: Note that it is rotated in place, that is, after str is rotated, it becomes "gabcdef".

Example 4:
Input: str="abcdefg", offset =2
Output: str = "fgabcde"	
Explanation: Note that it is rotated in place, that is, after str is rotated, it becomes "fgabcde".

Example 5:
Input: str="abcdefg", offset = 10
Output: str = "efgabcd"	
Explanation: Note that it is rotated in place, that is, after str is rotated, it becomes "efgabcd".

Challenge:
Rotate in-place with O(1) extra memory.

Solution:

// Left rotate string s by d (Assuming d <= n)
leftRotate(s, d)
  reverse(s, 0, d-1); // Reverse substring s[0..d-1]
  reverse(s, d, n-1); // Reverse substring s[d..n-1]
  reverse(s, 0, n-1); // Reverse whole string.  

// Right rotate string s by d (Assuming d <= n)
rightRotate(s, d)

  // We can also call above reverse steps
  // with d = n-d.
  leftRotate(s, n-d) 
 */
package com.coding.strings;

public class RotateString_8 {

	public static void main(String[] args) {

	}
	
	/**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public static void rotateStringRight(char[] str, int offset) {
    	int strLen = str.length;
    	
    	if(strLen == 0 || offset == 0) {
    		System.out.println(new String(str));
    		return;
    	}
    	
    	
		if(offset > strLen) {
			offset = offset%strLen;
		}
    	
    	//for right rotation  offset = strLen - offset
    	offset = strLen - offset;
    	
    	str = reverse(str, 0, offset-1);
    	str = reverse(str, offset, strLen-1);
    	str= reverse(str, 0, strLen-1);
    	
    	System.out.println(new String(str));
    }

	private static char[] reverse(char[] str, int start, int end) {
		while(start < end) {
			char tmp = str[start];
			str[start] = str[end];
			str[end] = tmp;
			++start;
			--end;
		}
		return str;
	}
}
