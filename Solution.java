/*

Given the array nums, obtain a subsequence of the array whose sum of elements is strictly greater than the sum of the non included elements in such subsequence. 

If there are multiple solutions, return the subsequence with minimum size and if there still exist multiple solutions, return the subsequence with the maximum total sum of all its elements. A subsequence of an array can be obtained by erasing some (possibly zero) elements from the array. 

Note that the solution with the given constraints is guaranteed to be unique. Also return the answer sorted in non-increasing order.

 

Example 1:

Input: nums = [4,3,10,9,8]
Output: [10,9] 
Explanation: The subsequences [10,9] and [10,8] are minimal such that the sum of their elements is strictly greater than the sum of elements not included, however, the subsequence [10,9] has the maximum total sum of its elements. 


*/

import java.util.*;
import java.io.*;


class Solution{
	public static List<Integer> solve(int arr[]) {
		int size = arr.length;
		List<Integer> list = new ArrayList<>();

		Arrays.sort(arr);

		int sum = Arrays.stream(arr).sum();

		int listSum = 0;
		for(int i = size-1; listSum<=sum; i--){
			list.add(arr[i]);
			listSum += arr[i];
			sum -= arr[i];
		}
		return list;
	}
	
	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size; i++)
			arr[i] = sc.nextInt();

		List<Integer> list = solve(arr);
		System.out.println(list);
	}
}