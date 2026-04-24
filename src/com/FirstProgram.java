package com;
import java.util.*;
public class FirstProgram {
	public static void evenOdd(int n) {
		if(n % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");			
		}
	}

	public static int findDuplicate(int[] numbers){
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; i++) {
				if(numbers[i] == numbers[j]) {
					return numbers[i];
				}
			}
		}
		return -1;
	}
	
	public static int findLength(String str) {
		return str.length();
	}
	
	public static int findUnique(int[] nums) {
		int ans = nums[0];
		for(int i = 1; i<nums.length; i++) {
			ans = ans ^ nums[i];
		}
		return nums[0];
		
	}
	
	public static void sortArray(int[] nums) {
		for(int i = 0; i<nums.length - 1; i++) {
			int mini = i;
			for(int j = i + 1; j < nums.length; i++) {
				if(nums[j] < mini) {
					mini = j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[mini];
			nums[mini] = temp;
		}
	}
	
	public static boolean primeCheck(int n) {
		for(int i = 2; i < (n/2); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int fact(int n) {
		int ans = 1;
		for(int i = 1; i <= n; i++) {
			ans *= i;
		}
		return ans;
	}
	
	public static int fib(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2); 
	}
	
	public static void swapNumbers(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}
	
	public static String reverseString(String str) {
		String ans = "";
		int n = str.length();
		for(int i = n - 1; i >= 0; i--) {
			ans += str.charAt(i);
		}
		return ans;
	}
	
	public static int countDigits(int n) {
		int count = 0;
		if(n == 0) {
			return 1;
		}
		while((n % 10)> 0) {
			count++;
			n /= 10;
		}
		return count;
	}
	
	public static int secondLargest(int[] nums) {
		int largest = Integer.MIN_VALUE;
		int slargest = Integer.MIN_VALUE;
		for(int n: nums) {
			if(n > largest) {
				slargest = largest;
				largest = n;
			}
			else if(n > slargest && n < largest) {
				slargest = n;
			}
		}
		if(slargest == Integer.MIN_VALUE) {
			return -1;
		}
		else {
		    return slargest;
		}
	}
	
	public static int arraySum(int[] nums) {
		int sum = 0;
		for(int n : nums) {
			sum += n;
		}
		return sum;
	}
	
	public static int maxNum(int[] nums) {
		int maxi = Integer.MIN_VALUE;
		for(int n: nums) {
			if(n > maxi) {
				maxi = n;
			}
		}
		return maxi;
	}
	
	public static int minNum(int[] nums) {
		int mini = Integer.MAX_VALUE;
		for(int n: nums) {
			if(n < mini) {
				mini = n;
			}
		}
		return mini;
	}
	
	public static String removeDuplicates(String str) {
		String ans 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter str");
		//int str= sc.nextInt();
		//int ans = countDigits(str);
		//System.out.println(ans);
		int[] nums = {10,2,4,5,7};
		int sl = secondLargest(nums);
		System.out.println(sl);
	}
}
