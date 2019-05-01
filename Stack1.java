package test;

import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		Stack<String> ss=new Stack<String>();
		s.push("aaaa");
		s.add("bbbb");
		s.push("cccc");
		s.push("dddd");
		s.push("eeee");
		s.push("ffff");
		s.push("ffff");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
		System.out.println(s.isEmpty()+"     "+ss.empty()+" "+ss.equals(s));
		ss.add("aaaa");
		System.out.println(s.peek());
		System.out.println(s.size());
 
	}

}
