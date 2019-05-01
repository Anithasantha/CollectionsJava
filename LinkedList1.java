package test;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> num=new LinkedList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(3);
		num.add(3);//allows duplicates
		num.add(4);
		num.add(5);
		num.add(6);
		
		System.out.println(num);
		num.remove(6);//removed by index of 6
		System.out.println(num);
		num.addFirst(0);
		num.addLast(7);
		System.out.println(num);
		System.out.println(num.indexOf(7)+"   "+num.isEmpty());
		num.offerFirst(123);
		System.out.println(num);
		

	}

}
