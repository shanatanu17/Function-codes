public class check_even_or_not
{
   public static void main(String ss[])
   {
      int no = 19;
	  boolean ans = check(no);
	  System.out.println(ans);
   }
   
   
   public static boolean check(int no)
   {
      if(no % 2 == 0)
	  {
	    return true;
	  }
	  
	  return false;
   }

}