import java.util.*;

public class Find_fibonacci_series
{
  public static void find(int no){
     
	 int fib0 = 0;
	 int fib1 = 1;
	 
	 System.out.print(fib0+" ");
	 System.out.print(fib1+" ");
	 
	 
	 while(no > 2)
	 {
	   int fib2 = fib1 + fib0;
	   System.out.print(fib2+" ");
	   fib0 = fib1;
	   fib1 = fib2;
	   no--;
	 }
  }



   public static void main(String ss[])
   {
	  Scanner sc  =new Scanner(System.in);
	   
	  System.out.println("Enter the value for n");
      int n  = sc.nextInt();
	  
	  find(n);
   
   }

}