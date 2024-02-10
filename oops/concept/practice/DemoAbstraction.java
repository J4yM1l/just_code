package com.oops.concept.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class DemoAbstraction {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Animal a1 = new Human(2, "Black");
//	        System.out.println(a1);
		int val = 15%3;
		int val1 = 15%5;		
		Human man = new Human(1, "black");
		Human man1 = new Human(2, "black");
		Human man2 = new Human(3, "black");
		List<Human> obj = List.of(man,man1,man2);
		
	     ArrayList<Integer> boxes2 = new ArrayList<>(List.of(2, 2));
	     // ===================================================
	     for(Human pep: obj){
	        System.out.println(pep);
	     }
//	     System.out.println(getMaxUnit(num,boxes,unitSize,unitsPerBox,truckSize));
	        

	}
	
	public static int getMaxUnit(int num, ArrayList<Integer> boxes, int unitSize, ArrayList<Integer> unitsPerBox, long truckSize){
	     PriorityQueue<Integer> PQ = new PriorityQueue<>();
	     for(int i=0;i<num;i++){
	         int n= boxes.get(i);
	         for(int j=0;j<n;j++){
	             PQ.add(unitsPerBox.get(i));
	             if(PQ.size()>truckSize) PQ.remove();
	         }
	     }
	     int max=0;
	     while(!PQ.isEmpty()){
	         max += PQ.remove();
	     }
	     return max;
	 }
	

}



