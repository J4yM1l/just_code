package com.practice.leetcode;

public class Reverse_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reversingInteger(1534236469));		
//		System.out.println(reversingInteger(1534236469));
//		permutation("School", "pre");
//		permutation("School");
		
	}

	/* convert the int value into string 
	 * check the length of the string if > 2^32 return 0, else
	 * check zero position character ascii value if not in the range of 0-9 slice character
	 * if last position character is 0 skip and continue the reverse process.
	 * NOTE: any zero's in front of any integer value is ignored.
	 * Integer values holds a certain max value. above max value, its an overflow
	 * */
	public static int reversingInteger(int x) {
		String value = String.valueOf(x); //converts int to string	
		char c = ' ';
		String subStr = "";
		int revNum = 0;
//		int val = (1+1)%14;
//		System.out.println("Val1 "+val);
//		System.out.println("Val2 "+(1-1)%13);
		if(value.length() <= 1) {
			return x;
		}
		
		if(value.charAt(0) < '0' || value.charAt(0) > '9') {
			c = value.charAt(0);
			value = value.substring(1)+""+c;			
		}
				
		
		for(int i = (value.length()-1); i>=0; i--) {												
				subStr+= value.charAt(i);	
		}
		
		try {
		
		if(Integer.parseInt(subStr) >= Integer.MAX_VALUE) {
			return 0;
		}
		revNum = Integer.parseInt(subStr);
		}catch(NumberFormatException e) {			
			System.out.println("OverFlow");
//			Math.abs(a);
			
		}
		
		return revNum;
//		if(x/10 <= 0) {
//			System.out.println("Xs: "+x);			
//			return x/10;
//		}
		
//		int left = x/10;
//		int last = x%10;
//		int val = 1/10;
//		System.out.println("Val: "+val);
		
//		System.out.println("left: "+left);
//		System.out.println("last: "+last);
		
//		 + reversingInteger(x%10) 
//		return reversingInteger(x%10)+ reversingInteger(x/10) ;
	}
	
	static void permutation(String str){
		permutation(str, "");
	}
	
	static void permutation(String str, String prefix){
		System.out.println("REM: "+str +" Pfix: "+prefix);
		if(str.length() == 0) {
			System.out.println(prefix);			
		}
		else {
			for(int i=0; i < str.length(); i++) {
				String strt = str.substring(0, i);
				String rest = str.substring(i+1);
				System.out.println("Strt: "+strt +"\nRest: "+rest);
				String rem = str.substring(0, i) + str.substring(i+1);
				System.out.println("Pref "+(prefix + str.charAt(i)) +" Postfix "+str.charAt(i));
				System.out.println("rem "+rem);
				permutation(rem, prefix + str.charAt(i));
			}
		}
	}
	
	 

}
