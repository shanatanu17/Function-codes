public class find_Max_USing_recursion
{
    public static void main(String ss[])
	{
	   int arr[] = new int[]{10,33,-45,23,1};
	   
	   
	   int max = Integer.MIN_VALUE;
	   
	   
	   for(int i=0;i<arr.length;i++)
	   {
	      if(arr[i] > max)
		  {
		     max = arr[i];
		  }
	   }
	   
	   System.out.println("Maximum element is " + max);
	
	
	
	}

}