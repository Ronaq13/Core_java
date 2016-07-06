package ronaq;

import java.util.TreeSet;

public class learn{
	
	public static void main(String args[])throws Exception
	{
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");         // ASCI code is higher than all, hence add at last
		t.add("B");
		t.add("Z");
		t.add("L");
		
		Character obj1 = 'A';    // autoboxing
		Character obj2 = 'Z';    // autoboxing
		if((obj2.compareTo(obj1))>0)
			System.out.println(t);
	}
	
		
}
