import java.util.*;


public class Calculate_cube
{
   public static int cube(int number)
   {
      int ans = number*number*number;
	  return ans;
   
   }


   public static void main(String ss[])
   {
      Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the number");
	  int no = sc.nextInt();
	  
	  int ans = cube(no);
	  System.out.println("Cube of a " + no + " is ---->  "  + ans);
   }
}