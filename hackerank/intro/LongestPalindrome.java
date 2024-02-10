package com.hackerank.intro;

public class LongestPalindrome {

    public static void main(String [] args) {

        String str = "aaaabbaa";//"forgeeksskeegfor"; //"abcbdef";
        int mid = str.length()/2;
        String first = str.substring(0,mid);
        String last = str.substring(mid);
        System.out.println("First "+first+ " Last "+last+" mid "+mid);
        checkPalindrome(first, last);

    }

    public static void checkPalindrome(String f, String l){
        String first = f;
        String last = l;
        boolean yes = false;
        System.out.println(first + " + "+ last);
        int begin = 0;
        int end = last.length()-1;
        System.out.println("Begin "+begin + " Last "+end);
        if (begin<last.length()&&first.charAt(begin) != last.charAt(end)){
            first = first.substring((begin+1),first.length());
            last = last.substring(0,end);
            yes = false;
            begin++;
            end--;
            System.out.println("Diff First "+first+" Diff Last "+last);
            System.out.println(yes);
            checkPalindrome(first, last);
        }else if (begin<last.length()&&first.charAt(begin) == last.charAt(end)) {
                System.out.println("Out side while loop ");
            while (begin<first.length()&&(first.charAt(begin) == last.charAt(end))){
                yes = true;
                System.out.println("Same First "+first.charAt(begin)+" Same Last "+last.charAt(end));
                begin++;
                end--;
                System.out.println(yes);

            }

//            System.out.println(yes);

            if(begin != last.length()) {
//                System.out.println("Not a palindrome " + yes);
                System.out.println("diff first char "+first.charAt(begin)+" diff last char "+last.charAt(end));
                first = first.substring((begin+1),first.length());
                last = last.substring(0,end);
                checkPalindrome(first, last);
            }else {
                System.out.println("Palindrome " + yes);
            }
        }
//        if(begin != last.length()) {
//            System.out.println("Not a palindrome " + yes);
//        }else {
//            System.out.println("Palindrome " + yes);
//        }
    }
}
