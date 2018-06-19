package jihelei;

import java.util.*;
import java.util.TreeSet;


class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = (String) o1;
		String s2 = (String) o2;
		int temp = s1.length() - s2.length();
		return temp;
	}
	
}

public class Example14 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add("Jack");
		ts.add("Helena");
		ts.add("Eve");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
	}

}