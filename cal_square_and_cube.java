import java.util.*;

public class cal_square_and_cube
{
   public static void main(String ss[])
   {
     Scanner sc = new Scanner(System.in);
     
	 System.out.println("Enetr a number");
     int no = sc.nextInt();
 
     int ans[] = sqcube(no); 
	 
	 System.out.println(ans[0]);
	 System.out.println(ans[1]);
   }
   
   
   public static int[] sqcube(int no)
   {
      int arr[] = new int[2];
	   
      int sq = no*no;
	  int cube = no*no*no;
	  
	  arr[0] = sq;
	  arr[1] = cube;
	  
	  return arr;
	  
	  
   }
   
   
}