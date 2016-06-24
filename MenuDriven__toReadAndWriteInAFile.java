package ronaq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class learn {

	public static void main(String args[]) throws IOException
	{
		 	String answer;
				do{	
					Scanner sc = new Scanner(System.in);
					int n;
					System.out.print(".....Hello....");
					System.out.println("\n\t 1. Enter data in a file");
					System.out.println("\n\t 2. Read data from file");
					System.out.print("Enter your choice:");
					n = sc.nextInt();
					sc.nextLine();
					
					switch(n)
					{
								case 1 :    FileWriter f1 = new FileWriter("bcd.txt");
											BufferedWriter bw = new BufferedWriter(f1);
											System.out.println("Enter data:...");
											String data;
											data = sc.nextLine();
											bw.newLine();
											bw.write(data);
											bw.flush();
											bw.close();
											break;
											
								case 2 :    FileReader f = new FileReader("bcd.txt");
											BufferedReader br= new BufferedReader(f);
											String line = br.readLine();                             //here readLine will store first line in 'line' variable
											while(line!=null)
											{
												System.out.println(line);                           
												line=br.readLine();                                 //here readLine will store second line in 'line'
											}
										
											br.close();
											break;
											
								default :  System.out.println("...........------>Entered wrong choice.......");			
					}
					System.out.println("\n\nWant to enter more (yes/no) : ");
					answer = sc.nextLine();
					
				}while(answer.equals("yes"));
		
	}
}
