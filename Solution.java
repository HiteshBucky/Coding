import java.util.*;
import java.io.*;


class Solution{
	public static int solve(int sum, int x) {
		int ans = sum;
		int temp;
		while(sum>=x){
			temp = sum/x;
			ans += temp;
			sum = (sum - x*temp) + temp;
		}
		return ans;
	}
	
	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int x = sc.nextInt();
		System.out.println(solve(sum, x));
	}
}