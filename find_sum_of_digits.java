public class find_sum_of_digits
{
   public static void main(String ss[])
   {
      int no = 987;
	  int sum = 0;
	  int ans = solve(no,sum);
	  System.out.println("Sum of digits of a number is "+ ans);
   }
   
   
   public static int solve(int no , int sum)
   {
      while(no != 0)
	  {
	    int ld = no % 10;
		sum = sum + ld;
		no = no / 10;
	  }
	  
	  return sum;
   }
}
