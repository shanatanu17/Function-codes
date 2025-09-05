public class check_prime_no
{
   public static void main(String ss[])
   {
      int no = 17;
	  
	  int val = solve(no);
	  if(val > 2)
	  {
	    System.out.println("Not prime no");
	  }
	  else
	  {
	     System.out.println("Prime no");
	  }
   }
   
   
   public static int solve(int no)
   {
      int count = 0;
	  for(int i=1;i<=no;i++)
	  {
	     if(no % i == 0)
		 {
		   count++;
		 }
	  }
	  
	  return count;
   
   }

}