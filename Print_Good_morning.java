public class Print_Good_morning
{
   public static void main(String ss[])
   {
      printgm("good morning" , 0);
   
   }
   
   public static void printgm(String s , int i)
   {
	  //base case
      if(i == 5)
	  {
	     System.out.println("Stop");
	  }
	  else
	  {
	     System.out.println(s);
		 i++;
		 printgm(s,i);   // recursive call
		 
	  
	  }
      
   }
}