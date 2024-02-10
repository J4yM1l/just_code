package com.hackerank.intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("/Users/jaymil/Documents/Coding practice workspace/Logic practice/Hacker_Rank/src/textfiledir/phonebook");
		Scanner sc = new Scanner(file);
		Map <String, Integer> dir = new HashMap<String, Integer>();
		int n = sc.nextInt();
		sc.nextLine();
//		System.out.println("N: "+ n);
		String name;
		int phone;
		for(int i = 0; i<n; i++) {
			name = sc.nextLine();
//			System.out.println("Name: "+ name);
			phone = Integer.parseInt(sc.nextLine());
//			System.out.println("Phone: "+ phone);
			dir.put(name, phone);
			
//			for(Map.Entry m:dir.entrySet()){
//				
//				   System.out.println(m.getKey()+" "+m.getValue());  
//				  }  
		}
		while(sc.hasNext()) {
			String checkNames = sc.nextLine();
//			System.out.println("Checking 4 name: "+checkNames);
			if(dir.containsKey(checkNames)) {
				int num = dir.get(checkNames);
				System.out.println(checkNames+"="+num);
			}else {
			System.out.println(checkNames+ " Not found!");
			}
		}
		
//		System.out.println(dir.ge);
	}

}
