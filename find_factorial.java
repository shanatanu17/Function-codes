public class find_factorial
{
    public static void main(String ss[])
	{
	    
		int n = 6;
		
		int ans = solve(n);
		System.out.println(ans);
	}
	
	
	public static int solve(int n)
	{
	   //base case
	   if(n == 1)
	    {
		   return 1;
		}
		
		int recurans = solve(n-1);
		
		int finalans = n * recurans;
		
		return finalans;
	
	
	
	}


}
