package com.hackerank.intro;
import java.util.stream.IntStream;
public class MakingAnagrams {

    public static void main(String[] args){

        String f = "aaaab";//"bacdc";
        String s = "bbaaa";//"dcbac";
//        System.out.println(numberNeeded4(f, s));
        test();
//        System.out.println("Index val: "+ ind);
    }

    public static int numberNeeded(String first, String second) {

        int [] letters =  new int[26];
        for(char c : first.toCharArray()){
            letters[c-'a']++;
            System.out.print(c+"-");
        }
        System.out.println();
        for(char c : second.toCharArray()){
            letters[c-'a']--;
            System.out.print(c);
        }
        System.out.println();
        return IntStream.of(letters).map( i -> Math.abs(i)).sum();
    }

    public static int numberNeeded4(String one, String two){
        int [] letters =  new int[26];
        one.chars().forEach( c -> { letters[c-'a']++; });
        two.chars().forEach( c -> { letters[c-'a']--; });
        return IntStream.of(letters).map( i -> Math.abs(i)).sum();
    }

    public static void test(){
        int [] letters =  new int[26];
        int count = 0;
        "aaaab".chars().forEach( c -> { letters[c-'a']++; System.out.print(c+"+"); });
        "bbaaa".chars().forEach( c -> { letters[c-'a']--; System.out.print(c+"-");});
        System.out.println();
        for(int v: letters){
            System.out.println(v);
            count++;
        }
//        int val = 'b'-'a';
//        int res = letters['b'-'a']++;
        System.out.println("Result "+ count);

//        return res;
    }

}
