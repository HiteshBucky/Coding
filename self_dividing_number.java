import java.util.*;
import java.io.*;

/*
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Input: 
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

*/
class Solution{
	 public static boolean isAns(int x){
        int num = x;
        if(num == 0) return false;
        boolean ans = true;
        while(num > 0){
            int rem = num % 10;
            if(rem == 0 || ( x % rem != 0) ) return false;
            num /= 10;
        }
        return true;
    }
	static void solve(int left, int right){
		List<Integer> list = new ArrayList<>();
        
        for(int num = left; num<=right; num++)
            if(isAns(num)) list.add(num);

        System.out.println(list);
	}
	
	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		int left = sc.nextInt(), right = sc.nextInt();
		solve(left, right);
	}
}