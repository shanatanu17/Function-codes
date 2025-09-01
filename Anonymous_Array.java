public class Anonymous_Array
{
    public static void print_array(int arr[])
	{
	  for(int i : arr)
	  {
	     System.out.print(i+" ");
	  }
	}


    public static void main(String ss[])
	{
	   print_array(new int[]{10,20,30,40,50});
	}
}