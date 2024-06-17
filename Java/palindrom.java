package Java;

public class palindrom
{
	
		public static void main(String[] args)
		{
    int num=1991;
    int copy=num;
    int rev=0;
     while (num>0)
     {
    	 int t=num%10;
    	 rev=rev*10+t;
    	 num=num/10;
     }
    	 if(rev==copy)
    	 {
    		 System.out.println("Plaindrom");
    	 }
    	 else {
    		 System.out.println("Not a Palindrom");
    	 }
    	 
     }
	} 

