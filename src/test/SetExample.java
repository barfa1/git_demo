package test;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Value1");
		hs.add("Value2");
		hs.add("Value1");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);

	}

}
