import java.util.*;

public class check_palindrome_for_number
{
   public static void main(String ss[])
  {
      Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter a number");
	  int no = sc.nextInt();
	  
	  int rev = cal_reverse(no);
	  
	  if(rev == no)
	  {
	     System.out.println("palindormic number");
	  }
	  else
	  {
	     System.out.println("NOt palindromic number");
	  }
   }
   
   
   public static int cal_reverse(int no)
   {
       int revs = 0;
	   
	   while(no != 0)
	   {
	     int ld = no % 10;
		 revs = revs * 10 + ld;
		 no = no / 10;
	   }
	   
	   return revs;
   }
}