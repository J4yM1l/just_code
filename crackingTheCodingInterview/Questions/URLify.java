package com.crackingTheCodingInterview.Questions;

public class URLify {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog ";
		String input = "Mr John Smith";
		System.out.println(ReplaceStringAllSpaces(input));

	}

	public static String ReplaceStringAllSpaces(String input) {
		 StringBuilder newStr = new StringBuilder();
		 
//		 System.out.println("String Builder arr "+newStr.toString());
		String str = "%20";	
		StringBuilder str1 = new StringBuilder(str);
		int len = (input.toCharArray().length-1);
		System.out.println("length "+len);
		for(int ch = 0; ch <= len; ch++) {			
			if(input.toCharArray()[ch] == 32 && input.toCharArray()[ch+1] != 32) {	
				newStr.append(str1);				
				continue; 
			}else if((ch+1) == len && input.toCharArray()[ch+1] == 32) {
//				System.out.println("here!");
				newStr.append(input.toCharArray()[ch]);
				return newStr.toString();
			}				
			newStr.append(input.toCharArray()[ch]);
		}
		
				
		return newStr.toString();
	}

}
