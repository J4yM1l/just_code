package com.crackingTheCodingInterview.Questions;

public class OneWay {

	public static void main(String[] args) {
		String str1 = "pale";
		String str2 = "bale";
		System.out.println(checkEdit(str1, str2));
//		System.out.println(OneOrZeroEditAway(str1,str2));

	}
	
	public static boolean checkEdit(String strA, String strB) {
		int [] arr = new int[26];
		for(char A: strA.toCharArray()) {
			arr[A-'a']++;
			System.out.println("StrA "+A);
		}
		
		for(char B: strB.toCharArray()) {
			arr[B-'a']--;
			System.out.println("StrB "+B);
		}
		int sum = 0;
		for(int t: arr) {
			System.out.println("Nums "+Math.abs(t));
			sum +=Math.abs(t);
		}
		System.out.println("Total "+sum);
		if(sum <2)
			return true;
		
		return false;
		
	}
	
	public static boolean OneOrZeroEditAway(String strO, String strP) {
		boolean check = false;
		String countP = "";
		int count = 0;
//		if(strO.length() == strP.length()) {
			
			for(int c = 0; c < strO.toCharArray().length; c++) {
				if(!strP.contains(String.valueOf(strO.charAt(c)))) {
					count++;
					if(count > 1) {
						return false;
					}
				}
			}
//				if(strP.charAt(c) == strO.charAt(c)) {
//					countP += strO.charAt(c);
//					check = true;
//					continue;
//				}
//				if(strP.charAt(c) != strO.charAt(c))
//					countP += strO.charAt(c);
//					check = false;
//					count++;
//			}
			System.out.println("Word "+countP);
//			if(check) {
//				return false;
//			}
//		}
		return true;
		
	}
}
