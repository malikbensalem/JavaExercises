package com.qa.occurs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		System.out.println(allLetterOccurs("hello all of you"));
	}

	public static String allLetterOccurs(String sen) {
		return Arrays.asList(sen.split("")).stream().distinct().collect(Collectors.joining());
	}

}
