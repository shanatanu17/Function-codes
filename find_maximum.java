import java.util.*;

public class find_maximum
{
   public static void main(String ss[])
   { 
      Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the value for no1 and no2");
      int no1 = sc.nextInt();
	  int no2 = sc.nextInt();
	  
	  int ans = solve(no1,no2);
	  System.out.println("Maximum no 6is"  + ans);
   }
   
   public static int solve(int no1,int no2)
    {
	   if(no1 > no2)
	  {
	     return no1;
	  }
	  return no2;
	}
   

}