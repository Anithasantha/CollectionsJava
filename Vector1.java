package test;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Vector1");
		v.add("Vector2");
		v.add("Vector3");
		v.add("Vector3");//allows duplicates
		System.out.println(v);
		System.out.println(v.capacity());
		v.addElement("Vector5");
		System.out.println(v);
		v.clone();
		System.out.println(v.clone());
		System.out.println(v.elementAt(0));
		v.remove("Vector3");
		System.out.println(v.contains("Vector1"));//returns true
		v.insertElementAt("Vector4", 3);
		System.out.println(v);
		
		
		
	}

}
