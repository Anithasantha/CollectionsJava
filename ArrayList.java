package test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("Anitha");
		name.add("Anitha"); //storing duplicates
		name.add("Subhashini");
		name.add("Dhinarthi");
		name.add("Mithra");
		name.add("unknown");
		System.out.println(name);
		name.remove("unknown"); //remove the object
		System.out.println(name); //maintain insertion order
		ArrayList<Integer> rollno1=new ArrayList<Integer>();
		ArrayList<Integer> rollno2=new ArrayList<Integer>();
		rollno1.add(23);
		rollno2.addAll(rollno1);//add all elements of one AL to another AL
		System.out.println(rollno2);
		Iterator<String> itr=name.iterator();//	print one by one
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}

}
