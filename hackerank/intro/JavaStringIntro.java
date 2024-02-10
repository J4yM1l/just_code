package com.hackerank.intro;

public class JavaStringIntro {

	public static void main(String[] args) {
//		String A = "hello";
//		String B = "javaa";
//		int strSize = A.length() + B.length();
//		System.out.println(strSize);
//		int i = 0;
//		int res = 0;
//		int size = Math.min(A.length(), B.length());
//		System.out.println("Min "+size);
//		if(A.length() == B.length()) {
//		while((i < A.length()) && A.charAt(i) != B.charAt(i)) { 
//			res = A.charAt(i) - B.charAt(i); 
//			System.out.println(A.charAt(i) + " <=> "+ B.charAt(i));
//			System.out.println(res + " I: "+i);
//			i++;
//		}
//		res = A.charAt(i) - B.charAt(i); 
//		if(res == 0) {
//			System.out.println("Same");
//		}else if(res > 0) {
//			System.out.println("A < B");
//		}else {
//		System.out.println("A > B");
//		}
//	}	
//		System.out.print("Test "+ res);
//		
		print();
	}
	
	static void print() {
		for(int row = 0; row<=7; row++) {
			for(int col = 0; col<=row; col++) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}

}
