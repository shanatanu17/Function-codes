import java.util.*;

public class Reverse_a_Number
{
   public static void main(String ss[])
   {
	  Scanner sc = new Scanner(System.in);
	   
      System.out.println("Ente a value for number");
      int no = sc.nextInt();
	  int rev = 0;
	  reverseno(no,rev);
   }
   
   
   public static void reverseno(int no, int rev)
   {
       //base case
	   if(no == 0)
	   {
	      System.out.println("reverse no is---->  " + rev);
		  System.out.println("stop");
	   }
   
     else
	 {
       int ld = no % 10;
       rev = rev * 10 + ld;
       no = no / 10;
 
       reverseno(no,rev);
	 }
	   
  
   
   }

}