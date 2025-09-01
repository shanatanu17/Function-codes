import java.util.*;

public class Claculate_Maxvalue
{
   
   public static int findmax(int arr[])
   {
	   int max = Integer.MIN_VALUE;
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i] > max)
		   {
			   max = arr[i];
		   }
	   }
	   
	   return max;
     
   }




   public static void main(String ss[])
   {
      Scanner sc = new Scanner(System.in);
	  int arr[] = new int[6];
	  int n = arr.length;
	  
      System.out.println("Enter the array elements ");
	  for(int i=0;i<n;i++)
	  {
		  arr[i] = sc.nextInt();
	  }
	  
	  System.out.println("Array elements are ");
	  for(int i=0;i<n;i++)
	  {
		  System.out.print(arr[i] + " ");
	  }
	  
	  System.out.println();
	  
	  int ans = findmax(arr);
	  System.out.println("Maximum element i aray is " + ans);
	  
	  
      	  
   }

}