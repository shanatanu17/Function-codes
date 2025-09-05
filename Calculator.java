import java.util.*;

public class Calculator
{
    public static void main(String ss[])
	{
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		
		
		System.out.println("Enter 2 values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sol = 0;
		
		
		
		switch(choice)
		{
		   case 1:
		   sol = addition(a,b);
		   System.out.println("Addition is " + sol);
		   break;
		   
		   
		   case 2:
		   sol = subtract(a,b);
		   System.out.println("Subtraction is "  + sol);
		   break;
		   
		   
		   case 3:
		   sol = multiply(a,b);
		   System.out.println("Multiplication is " + sol);
		   break;
		   
		   
		   case 4:
		   sol = divide(a,b);
		   System.out.println("Divide value is " + sol);
		   break;
		   
		}
		
	
		
		
	}
	
	public static int addition(int a,int b)
	{
	    int ans = a+b;
	    return ans;
	}
	
	public static int subtract(int a , int b)
	{
	    int ans = a-b;
        return ans;		
	}
	
	public static int multiply(int a,int b)
	{
	    int ans = a*b;
		return ans;
	}
	
	public static int divide(int a,int b)
	{
	   int ans = (int)(a/b);
	   return ans;
	}
	
	



}