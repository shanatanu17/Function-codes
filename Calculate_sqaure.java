import java.util.*;

public class Calculate_sqaure
{
	public static void calsquare(int no)
    {
     int ans = no*no;
     System.out.println("Square of a number is "+ans);
	}
	
	
    public static void main(String ss[])
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the value for number");
	   
	   int no = sc.nextInt();
	   calsquare(no);
	}
}