import java.util.*;


public class Calculate_percentage
{
    
	public static double percentage(int marks[])
	{
	   int totalsum = 0;
	   int n = marks.length;
	   
	   for(int i=0;i<n;i++)
	   {
	      totalsum = totalsum + marks[i];
	   }
	   
	   double percent = totalsum / n;
	   
	   return percent;
	}



    public static void main(String ss[])
	{
	   Scanner sc = new Scanner(System.in);
	   
	   int marks[] = new int[]{70,60,90,80,50,100};
	   
	   double ans = percentage(marks);
	   
	   System.out.println("Percentage is " + ans);
	
	
	
	}
	
	
}