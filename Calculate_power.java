public class Calculate_power
{
   public static void main(String ss[])
   {
      int base = 5;
	  int index = 3;
	  int ans= 1;
	  
	  calpower(base,index,ans);
   }
   
   
   public static void calpower(int base,int index,int ans)
   {
      if(index != 0)
	  {
		 index--;
	     ans = ans * base;
		 calpower(base,index,ans);    // recursive call
	  }
	  else
	  {
	     // base case
		 System.out.println("power value is ---> " + ans);
	     System.out.println("Stop");
	  }
   
   }

}