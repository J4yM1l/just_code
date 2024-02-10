package com.hackerank.intro;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CurrencyFormatter {

	public static void main(String[] args) {
		// TODO Applying currency Format on an amount value using 4 different country locale.
	/**
		double temp = Math.pow(10, 9);//12324.134;
		Scanner in = new Scanner(System.in);
//		System.out.print("Enter amount");
//		double amnt = in.nextDouble();
//		double exp = Math.pow(10, 9);
//		System.out.println(temp);
		//creating a custom locale for india bc not on the list of default locale
		Locale indi = new Locale("en", "IN");
		if(temp >= 0 && temp <= Math.pow(10, 9)) {
		//formatting the amount value based on country locale with their currency format.
		String usa = NumberFormat.getCurrencyInstance(Locale.US).format(temp);
		String india = NumberFormat.getCurrencyInstance(indi).format(temp);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(temp);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(temp);
		System.out.println(usa);
		System.out.println(india);
		System.out.println(china);
		System.out.println(france);
		}else {
			System.out.println(temp + " is out of bounds");
		}
**/
		
		String f = "cde";
		String s = "abc";
		System.out.println(numberNeeded(f, s));
	}
	
	public static int numberNeeded(String first, String second) {

        int [] letters =  new int[26];
        for(char c : first.toCharArray()){
            letters[c-'a']++;
        }
        for(char c : second.toCharArray()){
            letters[c-'a']--;
        }

        return IntStream.of(letters).map( i -> Math.abs(i)).sum();
    }
	
	public static int numberNeeded4(String one, String two){
        int [] letters =  new int[26];
        one.chars().forEach( c -> { letters[c-'a']++; });
        two.chars().forEach( c -> { letters[c-'a']--; });
        return IntStream.of(letters).map( i -> Math.abs(i)).sum();
    }


}
