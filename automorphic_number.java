public class automorphic_number
{
   public static void main(String ss[])
    {
       int n = 376;
       int ans = solve(n);

       if(ans == n)
        {
           System.out.println("IT is automorphic no");
        }
       else
        {
           System.out.println("It is not a automorphic no");
        }
    }

 
   public static int solve(int n)
    {

       //1. count no of digits in n
       int cpn = n;
       int count = 0;

       while(cpn != 0)
        {
          count++;
          cpn = cpn / 10; 
        } 


      // 2 .find out square
       int sq = n * n;

     // 3 . extract digits from square
       int number = (int)(Math.pow(10,count));
       int checkno = sq % number; 
       return  checkno;
    }


}