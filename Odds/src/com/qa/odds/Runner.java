package com.qa.odds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		System.out.println(odds(new int[] {2,1,3,4,2,1,89}));
		System.out.println(odds(new int[] {2,4,6,2,6,4}));
		System.out.println(odds(new int[] {1,1,5,7}));
		
		

	}public static List<Integer> odds(int [] oddy){
		return Arrays.stream(oddy).boxed().filter(num->num%2==1).collect(Collectors.toList());
	}

}
