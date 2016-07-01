package ronaq;

import java.util.Scanner;

public class learn {

	public static void main(String args[]) throws Exception
	{
		int sum=0,n,tmp;
		Scanner sc = new Scanner(System.in);
		System.out.println("  1. Palindrome");
		System.out.println("  2. Armstrong");
		System.out.println("\n\nEnter your choice : ");
		int c = sc.nextInt();
		
		switch(c)
		{
		case 1 :    System.out.print("Enter the number : ");
					 n = sc.nextInt();
					 tmp = n;
					 while(n!=0)
					 {
						 int rem = n%10;
						 n=n/10;
						 sum=sum*10+rem;
					 }
					System.out.printf("Reverse number is :%d",sum);
					if(sum==tmp)
					{
						System.out.println("\n\nThe number is palindrome");
					}
					else
					{
						System.out.println("\n\nNoooppss");
					}
					
					break;
					
		case 2 :    System.out.print("Enter the number : ");
					 n = sc.nextInt();
					 tmp = n;
					 while(n!=0)
					 {
						 int rem = n%10;
						 n=n/10;
						 sum+=rem*rem*rem;
					 }
					System.out.printf("Sum of cubes of each digit is :%d",sum);
					if(sum==tmp)
					{
						System.out.println("\n\nThe number is palindrome");
					}
					else
					{
						System.out.println("\n\nNoooppss");
					}
					break;
		
		
		}
	
	}
	
}	
	
		
