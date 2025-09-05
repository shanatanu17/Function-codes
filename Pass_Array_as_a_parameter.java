public class Pass_Array_as_a_parameter
{
    public static void solve(int arr[])
	{
	   
	   for(int i=0;i<arr.length;i++)
	   {
	      arr[i] = arr[i] * 2;
	   }
	}
   
  

    public static void main(String ss[])
	{
	  int arr[] = new int[]{10,20,30,40,50};
	  
	  solve(arr);
	  
	  
	  for(int i=0;i<arr.length;i++)
	  {
	     System.out.print(arr[i]+" ");
	  }
	}

}