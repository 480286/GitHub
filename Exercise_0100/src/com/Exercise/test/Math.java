package com.Exercise.test;

import java.util.Random;

public class Math {

	Random random = new Random();
	int nums;
	
	public void aa() {
		int num = random.nextInt(9999-1000+1)+1000;
		nums = num;
		System.out.println(num);
	}
	
	public void bb() {
		System.out.println(nums);
	}
}
