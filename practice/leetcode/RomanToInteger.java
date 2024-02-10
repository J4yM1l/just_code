package com.practice.leetcode;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub, MCMXCIV
//		System.out.println(romanToInt("MCMXCIV"));
		System.out.println(romanToInt("XC"));
//		System.out.println(romToInt("CM"));
	}
	
	public static int romToInt(String str) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		 hashMap.put('I', 1);
		 hashMap.put('V', 5);
		 hashMap.put('X', 10);
		 hashMap.put('L', 50);
		 hashMap.put('C', 100);
		 hashMap.put('D', 500);
		 hashMap.put('M', 1000);
		 int left = 0;
		 int right = 0;
		 int sum = 0;
		 if(str.length() == 1) {
			 return hashMap.get(str.charAt(0));
		 }
		 
		 for(int i = 0; i< str.length()-1; i++) {
			 left = hashMap.get(str.charAt(i));
			 right = hashMap.get(str.charAt(i+1));
			 if(left >= right) {
				 sum += left + right;
				 str = str.substring(i+1);
				 System.out.println("New1 String "+str);
			 }else{
				 left = hashMap.get(str.charAt(i));
				 right = hashMap.get(str.charAt(i+1));
				 sum += left - right;
				 str = str.substring(i+1);
				 System.out.println("New String "+str);
			 }
		 }
		return sum;
	}
	
	 public static int romanToInt(String s) {
		 HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		 hashMap.put('I', 1);
		 hashMap.put('V', 5);
		 hashMap.put('X', 10);
		 hashMap.put('L', 50);
		 hashMap.put('C', 100);
		 hashMap.put('D', 500);
		 hashMap.put('M', 1000);
		 int last = 0;
		 int sum = 0;
		 if(s.length() == 1) {
			 return hashMap.get(s.charAt(0));
		 }
		 		 
		 int len = s.length()-2;		 
		 
		 for(int i = 0; i<s.length(); i++) {
			 last = hashMap.get(s.charAt(i));
			 if(i+1>=s.length() || (last >= hashMap.get(s.charAt(i+1)))) {
//				 last += hashMap.get(s.charAt(i));
				 sum += last;
				 System.out.println("LAst "+last);
//				 System.out.println("Second "+second);
			 }else {
			 sum +=  hashMap.get(s.charAt(i+1))-last ;
			 System.out.println("last "+last);
			 i++;
//			 System.out.println("second "+second);
			 
			 }
		 }
		return Math.abs(sum);
	        
	    }

}
