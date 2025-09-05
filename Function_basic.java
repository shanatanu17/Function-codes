public class Function_basic
{
    public static void main(String ss[])
	{
	   
	   int a = 10;
	   int b = 5;
	   int ans1 = add(a,b);
	   System.out.println("a+b before incrementing values");
	   System.out.println(ans1);
	   
	   
	   a = 11;
	   b = 6;
	   int ans2 = add(a,b);
	   System.out.println("a+b after incrementing values");
	   System.out.println(ans2);
	}
	
	public static int add(int a,int b)
	{
	   int ans = a + b;
	   return ans;
	}

}