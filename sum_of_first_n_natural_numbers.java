public class sum_of_first_n_natural_numbers
{
   public static void main(String ss[])
    { 
       int n = 20;
       int ans = solve(n);
       System.out.println("Sum of n natural numbers " + ans);
    }

    public static int solve(int n)
     {
        int sum = 0;
        for(int i=1;i<=n;i++)
         { 
            sum =  sum + i;
         } 

        return sum; 
     }

     

}