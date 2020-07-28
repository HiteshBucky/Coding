import java.util.*;

class Solution{
	static int solve(int a[]){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i<a.length; i++)
			if(map.containsKey(a[i])) map.put(a[i], map.get(a[i]) + 1);
			else map.put(a[i],1);
				
		int count = 0, temp;	
		for(Map.Entry<Integer, Integer> e : map.entrySet()){
			temp = e.getValue();
			count += (temp * (temp-1))/2;
		}
		return count;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int a[] = new int[size];

		for(int i = 0; i<size; i++){
			a[i] = sc.nextInt();
		}

		System.out.println(solve(a));
	}
		
}