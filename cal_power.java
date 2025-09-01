import java.util.*;

public class cal_power
{
   public static double Power(int base , int index)
   {
      return Math.pow(base,index);
	  
   }
  



   public static void main(String ss[])
   {
      int base = 2;
	  int index = 5;
	  
	  double ans = Power(base,index);
	  System.out.println(ans);
   }

}