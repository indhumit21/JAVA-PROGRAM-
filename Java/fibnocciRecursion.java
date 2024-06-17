package Java;

public class fibnocciRecursion 
{
	public static void main(String[] args) 
	{
		
	int n=10;
	System.out.println(" The count is " + counti(n));
}

  public static int counti(int n)
  {
	  int count=0;
	  for(int i=0;i<n;i++) 
	  {
  System.out.println(fibnocciRecursion(i));
		  
	  count++;
}
  return count;
  }

public static int fibnocciRecursion (int n)
{
	if(n == 0)
	{
     return 0;
	}
	else if(n==1)
	{
		return 1;
	}
	else
	{
		return fibnocciRecursion(n-1)+fibnocciRecursion(n-2);
	}
	
}
}
