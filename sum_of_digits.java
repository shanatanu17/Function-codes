import java.util.*;

public class sum_of_digits
{
    public static void main(String ss[])
	{
	   Scanner sc = new Scanner(System.in);
	   
	   
	   System.out.println("Enetr a number ");
	   int no = sc.nextInt();
	   
	   int ans = solve(no);
	   System.out.println("Sum of digits of a number is " + ans);
	}
	
	
	public static int solve(int no)
	{
	   int sum = 0;
	   
	   while(no != 0)
	   {
		  sum =sum + (no % 10);
          no = no / 10;		 
	   }
	
	 return sum;
	}

}