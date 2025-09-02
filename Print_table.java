import java.util.*;

public class Print_table
{
    public static void main(String ss[])
	{
	 Scanner sc = new Scanner(System.in);	 
		
	 System.out.println(" Enter a value for number ");
	 int no = sc.nextInt();
	 int i = 1;
	 printt(no,i);
	}
	
	
	public static void printt(int no , int i)
	{
	   if(i == 11)
	   {
	      System.out.println("stop");
	   }
	   else
	   {
	   System.out.println(no * i);
	   i++;
	   printt(no , i);
	   }
	
	}


}