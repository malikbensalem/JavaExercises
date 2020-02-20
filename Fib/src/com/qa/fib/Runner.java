package com.qa.fib;

public class Runner {

	public static void main(String[] args) {
		System.out.println(fib(2));
		System.out.println(fib(7));

	}

	public static int fib(int pos) {
		if (pos >= 0) {
			int[] nums = { 0, 1, 0 };
			for (int i = 0; i <= pos; i++, nums[2] = nums[0], nums[0] = nums[1], nums[1] += nums[2]) {
			}
			return nums[2];
		}
		return -1;
	}

}
