public class cal_factorial
{
   public static void main(String ss[])
   {
      int n = 7;
	  int ans = fact(n);
	  System.out.println("Factorial of a number is " + ans);
   }
   
   public static int fact(int n)
   {
      int f = 1;
	  
	  while(n != 0)
	  {
	     f = f * n;
		 n--;
	  }
	  
	  return f;
   }


}