package Java;

import java.util.Arrays;

public class arrayMerging 
{
	public static void main(String[] args)
	{
  int a[]= {1,3,4,7};
  int b[]= {9,0,6,5,};
  int c[]=new int[a.length +b.length];
  
  for(int i=0;i<a.length;i++)
  {
	  c[i]=a[i];
  }
  for(int i=0;i<b.length;i++)
  {
	  c[i+a.length]=b[i];
  }
  System.out.println(Arrays.toString(c));
}
}