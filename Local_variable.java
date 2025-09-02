public class Local_variable
{

public static void display(int t)
{
   int a = 20;
   System.out.println(t * a);
   show(a);
}

public static void show(int a)
{
   int b = 30; 
   System.out.println(a * b);

}




public static void main(String ss[])
{
   int t = 10;
   display(t);  
}




}