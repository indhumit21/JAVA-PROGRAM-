package Java;

import java.util.Scanner;

public class fibnocci 
{
  public static void main(String[] args)
  {
	 Scanner scn=new Scanner(System.in);
	 System.out.println("Enter Your lukcy number");
	 int n=scn.nextInt();
	 int fib1=0;
	 int fib2=1;
	 int fib3=fib1+fib2;
	 
	 for(int i=0;i<=n;i++)
	 {
		 System.out.println(fib1);
		 fib1=fib2;
		 fib2=fib3;
		 fib3=fib1+fib2;
	 }
				 
	  
			 
  }
}
