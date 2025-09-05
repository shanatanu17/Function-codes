public class Reverse_Number
{
   public static void main(String ss[])
   {
      int no = 1234567890;
	  
	  int ans = findReverse(no);
	  System.out.println(ans);
   }
   
   public static int findReverse(int no)
   {
      int rev = 0;
	  
	  while(no != 0)
	  {
	     int ld = no % 10;
		 rev = rev * 10 + ld;
		 no = no / 10;
	  }
	  
	  return rev;  
   }
   
   
}