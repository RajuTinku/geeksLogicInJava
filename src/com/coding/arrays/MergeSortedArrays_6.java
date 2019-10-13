/**
 * Merge two given sorted ascending integer array A and B into a new sorted integer array.

Example
Example 1:

Input:  A=[1], B=[1]
Output: [1,1]	
Explanation:  return array merged.
Example 2:

Input:  A=[1,2,3,4], B=[2,4,5,6]
Output: [1,2,2,3,4,4,5,6]	
Explanation: return array merged.

Challenge
How can you optimize your algorithm if one array is very large and the other is very small?


 */
package com.coding.arrays;

public class MergeSortedArrays_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;
        
        if(aLen == 0) {
        	return b;
        }
        
        if(bLen == 0) {
        	return a;
        }
        
        int[] mergedArr = new int[aLen+bLen];
        
        int i = 0;
        int p = 0;
        int q = 0;
        
        while(p < aLen && q < bLen) {
        	if(a[p] < b[q]) {
        		mergedArr[i] = a[p];
        		++p;
        	}else {
        		mergedArr[i] = b[q];
        		++q;
        	}
        	++i;
        }
        
        if( p < aLen) {
        	while(p < aLen) {
        		mergedArr[i++] = a[p++];
        	}
        }
        
        if(q < bLen) {
        	while(q < bLen) {
        		mergedArr[i++] = a[q++];
        	}
        }
        
        return mergedArr;
    }

}
