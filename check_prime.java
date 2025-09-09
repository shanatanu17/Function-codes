public class check_prime
{
   public static void main(String ss[])
   {
      int n = 10;
	  int count=0;
	  
	  boolean ans = solve(n,count);
	  System.out.println(ans);
   }
   
   public static boolean solve(int n,int count)
   {
      
	  for(int i=1;i<=n;i++)
	  {
	     if(n % i == 0)
		 {
		    count++;
		 }
	  }
	  
	  if(count > 2)
	  {
	     return false;
	  }
	  
	  return true;
   
   
   }

}