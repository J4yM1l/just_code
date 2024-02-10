package com.hackerank.intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("/Users/jaymil/Documents/Coding practice workspace/Logic practice/Hacker_Rank/src/textfiledir/demostackfile");
		Stack <Character>stack = new Stack<Character>();
		Scanner sc = new Scanner(file);
//		String input=sc.next();
//        System.out.println("Input: "+input);
		boolean unbalanced = false;

//		int rem = (input.length()% 2);
//		System.out.println(rem);
        while (sc.hasNext()) {
            String input=sc.next();
            boolean balanced = false;
            char emptyStr;
            int inputLen = input.length();
            int half = inputLen/2;
            if(input.length()%2 == 0) {
//                String A = input.substring(0,half);
//                String B = input.substring(half, (inputLen));

                for(char c: input.toCharArray()) {

                    if(stack.empty() && !(input.equals(" "))) {
                        System.out.println("Adding to stack: "+c);
                        stack.push(c);
                    }else {
                        switch (c){
                            case ')':
                                if(stack.peek() == '('){
                                    System.out.println("Matching Content: "+stack.peek() + " "+ c);
                                    stack.pop();
                                    balanced = true;
                                    break;
                                }else{
                                    System.out.println("Unmatched Content: "+stack.peek() + " "+ c);
                                    stack.push(c);
                                    break;
                                }
                            case '(':
                                if(stack.peek() == ')'){
                                    System.out.println("Matching Content: "+stack.peek() + " "+ c);
                                    stack.pop();
                                    balanced = true;
                                    break;
                                }else {
                                    System.out.println("Unmatched Content: "+stack.peek() + " "+ c);
                                    stack.push(c);
                                    break;
                                }
                            case '}':
                                if(stack.peek() == '{'){
                                    System.out.println("Matching Content: "+stack.peek() + " "+ c);
                                    stack.pop();
                                    balanced = true;
                                    break;
                                }else {
                                    System.out.println("Unmatched Content: "+stack.peek() + " "+ c);
                                    stack.push(c);
                                    break;
                                }
                            case '{':
                                if(stack.peek() == '}'){
                                    System.out.println("Matching Content: "+stack.peek() + " "+ c);
                                    stack.pop();
                                    balanced = true;
                                    break;
                                }else {
                                    System.out.println("Unmatched Content: "+stack.peek() + " "+ c);
                                    stack.push(c);
                                    break;
                                }
                            case ']':
                                if(stack.peek() == '['){
                                    System.out.println("Matching Content: "+stack.peek() + " "+ c);
                                    stack.pop();
                                    balanced = true;
                                    break;
                                }else {
                                    System.out.println("Unmatched Content: "+stack.peek() + " "+ c);
                                    stack.push(c);
                                    break;
                                }
                            case '[':
                                if(stack.peek() == ']'){
                                    System.out.println("Matching Content: "+stack.peek() + " "+ c);
                                    stack.pop();
                                    balanced = true;
                                    break;
                                }else {
                                    System.out.println("Unmatched Content: "+stack.peek() + " "+ c);
                                    stack.push(c);
                                    break;
                                }
                            default :
                                System.out.println("Unknown string Contents: "+c + "-");
//                                 stack.push(c);
//                                 balanced = true;
                                 break;

                        }
                    }

}
//                balanced = false;
                System.out.println("balanced: "+balanced);
            }else{
                balanced = false;
//                System.out.println();
                System.out.println("Unmatched Content: "+input);
                System.out.println("balanced: "+balanced);
}
        }
        System.exit(0);
		System.out.println();
		System.out.println("Size: "+stack.size());
		int len =stack.size();
//		stack.forEach(elem -> System.out.println(elem));
		for(int i=0; i<len; i++) {
			char ch = stack.pop();
			System.out.println(ch);
		}
		
//	    while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
//	    System.out.println(input);
//	    System.out.println(input.isEmpty());


	}

}
