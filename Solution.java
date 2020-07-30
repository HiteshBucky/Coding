import java.util.*;
import java.io.*;


class Solution{
	public static List<Integer> solve(int nums[]) {
		 List<Integer> list = new ArrayList<>();
		int[] count = new int[101];
        
	    int totalSum = 0;
	    for (int currInt : nums) {
	        totalSum += currInt;
	        count[currInt]++;
	    }
	    
	    int currSum = 0;
	    for (int i = count.length - 1; currSum<=totalSum && i >= 0; --i) {
	        while (count[i] > 0 && currSum<=totalSum) {
	            list.add(i);
	            currSum += i;
	            totalSum -= i;
	            count[i]--;
	        }
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