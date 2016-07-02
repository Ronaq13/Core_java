package ronaq;

import java.util.Vector;

public class learn{
	
	public static void main(String args[])throws Exception
	{
		Vector v = new Vector();
		System.out.println(v.capacity());
		for(int i =0;i<11;i++)
		{
			v.addElement(i);                         // automatically boxing will be done by compiler
		}	
			System.out.println(v.capacity());
			v.addElement("A");
			System.out.println(v.capacity());
			System.out.println(v);
		
	}
}	
	
		
