import java.util.*;


// for a string 

public class palindrome_check
{  
    public static void main(String ss[])
	{
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter a string ");
	   String str = sc.nextLine();
	   boolean ans = check(str);
	   
	   System.out.println(ans);
	}
	
	
	public static boolean check(String str)
	{
	   int i = 0;
	   int j = str.length()-1;
	   
	   while(i <= j)
	   {
	      if(str.charAt(i) != str.charAt(j))
		  {
		     return false;
		  }
		  
		  i++;
		  j--;
	   }
	   
	   return true;
	}

}