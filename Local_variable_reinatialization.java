public class Local_variable_reinatialization
{
   public static void main(String ss[])
   {
      int no = 10;
      display(no);
	  display(no);
	  display(no);
	  display(no);
	  
	  
   }
   
   
   public static void display(int no)
   {
	   
	  // here ,each time our m (local var ) is gets initialoized.....
      int m = 100;
	  m = m+1;
	  
	  System.out.println(m * no);
   
   }
}