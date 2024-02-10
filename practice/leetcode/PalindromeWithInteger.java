package com.practice.leetcode;

public class PalindromeWithInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(-121));
	}
	
	public static boolean isPalindrome(int x) {
	 	//int val = 121/121;
	 	//System.out.println("VAL "+ val);
	 	int count=-1;
	 	int tempX=x;
	 	while(Math.abs(tempX)>0){
	 		tempX=tempX/10;
	 		count++;		
	 	} 	
	 	count=(int)Math.pow(10,count);
	 	System.out.println(count +" "+tempX );
	    int lV=x; //121
	    int rV=x;  //121
	        for(int i=count; i>=0; i/=10){
	            //lV=x/i;
	            if(lV/((i==0)?10:i)!=rV%10)
	                return false;
	            if(i==0)break;
	            rV=rV/10; //12
	            lV=lV%((i==0)?10:i); //21
	            
	        }
	        return true;
	    }

}
