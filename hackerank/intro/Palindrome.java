package com.hackerank.intro;

public class Palindrome {

    public static void main(String [] args){

        String str = "aaaabbaa";//"abccba"; //"forgeeksskeegfor"
        String [] p = str.split(" ");
        String pal = String.join("", p);
        System.out.println(pal);

        if(pal.length()%2 > 0){
            int mid = (pal.length()/2);
            String first = pal.substring(0, mid);
            String last = pal.substring(mid+1);
            boolean yes = false;
            System.out.println(first + " + "+ last);
            int begin = 0;
            int end = last.length()-1;
            System.out.println("Begin "+begin + " Last "+end);
            while (begin<first.length()&&(first.charAt(begin) == last.charAt(end))){
                yes = true;
                begin++;
                end--;
                System.out.println(yes);
            }
            System.out.println("Out side while loop ");
            if(begin != last.length()) {
                System.out.println("Not a palindrome " + yes);
            }else {
                System.out.println("Palindrome " + yes);
            }
        }else {
            System.out.println("String is even ");
            int mid = (pal.length()/2);
            String first = pal.substring(0, mid);
            String last = pal.substring(mid);
            boolean yes = false;
            System.out.println(first + " + "+ last);
            int begin = 0;
            int end = last.length()-1;
            System.out.println("Begin "+begin + " Last "+end);

            while (begin<first.length()&&(first.charAt(begin) == last.charAt(end))){
                yes = true;
                begin++;
                end--;
                System.out.println(yes);
            }
            System.out.println("Out side while loop ");
            if(begin != last.length()) {
                System.out.println("Not a palindrome " + yes);
            }else {
                System.out.println("Palindrome " + yes);
            }

        }
    }




}
