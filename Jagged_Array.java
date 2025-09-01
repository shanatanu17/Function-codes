import java.util.*;

public class Jagged_Array
{
    public static void main(String ss[])
	{
	   Scanner sc = new Scanner(System.in);
		
	   int arr[][] = new int[4][];
	   
	   arr[0] = new int[4];
	   arr[1] = new int[2];
	   arr[2] = new int[3];
	   arr[3] = new int[5];
	   
	   
	   System.out.println("ENter the jagged array eleemnts");
	   for(int i=0;i<arr.length;i++)
	   {
	      for(int j= 0;j<arr[i].length;j++)
		  {
		     arr[i][j] = sc.nextInt(); 
		  }
	   }
	   
	   
	   System.out.println("jagged array eleemnts are ");
	   for(int i=0;i<arr.length;i++)
	   {
	      for(int j= 0;j<arr[i].length;j++)
		  {
		     System.out.print(arr[i][j]+" "); 
		  }
		  
		  System.out.println();
	   }
	   
	   
	   
	
	
	}
}