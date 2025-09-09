public class check_neon_no
{
   public static void main(String ss[])
    {
       int n = 11;
       int ans = solve(n);

       if(ans == n)
        {
           System.out.println("It is a neon no");
        }
       else
        {
           System.out.println("It is not a neon no");
        }
    }
  
   public static int solve(int n)
    {
       
       int sq = n * n;
       
       int cpsq = sq;
       int sum = 0;


       while(cpsq != 0)
        {
          int ld = cpsq % 10;
          sum = sum + ld;
          cpsq = cpsq / 10;
        }

        
        return sum;
    }




}