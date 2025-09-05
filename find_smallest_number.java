import java.util.*;

public class find_smallest_number
{
    public static void main(String ss[])
	{
	   Scanner sc= new Scanner(System.in);	
	
	   int arr[] = new int[5];
	   
	   System.out.println("Enter the array elements");
	   for(int i=0;i<arr.length;i++)
	   {
	      arr[i] = sc.nextInt();
	   }
	   
	   int ans = find(arr);
	   System.out.println("Smallest number is " + ans);
	}
	
	
	public static int find(int arr[])
	{
	   int min = Integer.MAX_VALUE;
	   
	   for(int i=0;i<arr.length;i++)
	   {
	      if(arr[i] < min)
		  {
		     min = arr[i];
		  }
	   }
	   
	   return min;
	}
	
	
	
	

}