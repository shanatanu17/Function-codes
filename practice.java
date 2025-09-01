public class practice

{
	public static void sum(int... arr)
	{
		int total = 0;
		for(int i:arr)
		{
			total = total + i;
		}
		
		System.out.println("Sum is " + total);
	}
	
	
   public static void main(String ss[])
   {
	   sum(10,20,30);
	   sum(100,2000,3000);
	   sum(0);
	   
      
   
   }

}