import java.util.*;

public class Calculate_factorial
{
    public static void factorial(int no)
	{
	
	    int fact = 1;
		
		for(int i=1;i<=no;i++)
		{
		  fact = fact * i;
        }

        System.out.println("Factorial of a number is  " + fact);		
	}
	
	
	public static void main(String ss[])
	{
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter the value of no");
	   int no = sc.nextInt();
	   factorial(no);
	
	
	}
}