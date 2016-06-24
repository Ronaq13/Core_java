package ronaq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class learn {

	public static void main(String args[]) throws IOException
	{
		 	PrintWriter pw = new PrintWriter("file3.txt");
		 	BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		 	String line = br.readLine();
		 	while(line!=null)
		 	{
		 		pw.println(line);
		 		line=br.readLine();
		 		
		 	}
		 	br = new BufferedReader(new FileReader("bcd.txt"));
		 	String line1 = br.readLine();
		 	while(line1!=null)
		 	{
		 		pw.println(line1);
		 		line1=br.readLine();
		 	}
		 	
		 	pw.flush();
		 	pw.close();
	}
}
