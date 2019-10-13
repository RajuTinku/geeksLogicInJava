/**
 * For a given sorted array (ascending order) and a target number, find the first index of this number in O(log n) time complexity.

If the target number does not exist in the array, return -1.

Example
Example 1:
	Input:  [1,4,4,5,7,7,8,9,9,10]，1
	Output: 0
	
	Explanation: 
	the first index of  1 is 0.

Example 2:
	Input: [1, 2, 3, 3, 4, 5, 10]，3
	Output: 2
	
	Explanation: 
	the first index of 3 is 2.

Example 3:
	Input: [1, 2, 3, 3, 4, 5, 10]，6
	Output: -1
	
	Explanation: 
	Not exist 6 in array.

Challenge
If the count of numbers is bigger than 2^32, can your code work properly?

 */
package com.coding.arrays;

public class FirstPositionOfNumber_14 {

	public static void main(String[] args) {
		int[] inp = new int[] {1,4,4,5,7,7,8,9,9,10};
		int target = 9;
		int index = binarySearch(inp, target);
		System.out.println(index);
	}
	
	 /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public static int binarySearch(int[] nums, int target) {
    	
    	int numsLen = nums.length;
    	int index = -1;
    	
    	if(numsLen == 0) {
    		return index;
    	}
    	
    	int start = 0;
    	int end = numsLen - 1;
    	int mid = end + (start-end)/2;
    	
    	while(start <= end) {
    		if(nums[mid] == target) {
    			index = mid;
    			end = mid-1;
    		}else if(nums[mid] > target) {
    			end = mid - 1;
    		}else {
    			start = mid+1;
    		}
    		mid = end + (start-end)/2;
    	}
    		
    	return index;
    	
    	
    }

}
