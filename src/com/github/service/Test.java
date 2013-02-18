package com.github.service;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
    String    [] names = {"omkar","amit","darshan","Omkar"};
    System.out.println(Arrays.asList(names));
 
    Arrays.sort(names);
   
    System.out.println(Arrays.asList(names));
    
	}

}
