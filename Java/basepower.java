package Java;

public class basepower 
{
 public static void main(String[] args)
 {
	  int power=10;
	  int base=10;
	  int result=1;
	  
	  while(power>0)
	  {
		  result=result*base;
		  power--;
		  System.out.println(result );
	  }
 }
}
