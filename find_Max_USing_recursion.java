public class find_Max_USing_recursion
{
    public static void main(String ss[])
	{
	   int arr[] = new int[]{10,345,22,1113,-89,-4,48,-78};
	   
	   int index = 0;
	   int n = arr.length;
	   int max = Integer.MIN_VALUE;
	   
	   findmax(arr,n,index,max);
	}
	
	
	public static void findmax(int arr[] ,int n, int index , int max)
	{
		if(index < n)
		{
			if(arr[index] > max)
			{
				max = arr[index];
				index++;
				findmax(arr,n,index,max);
			}
			else
			{
				index++;
				findmax(arr,n,index,max);
			}
			
		}
		else
		{
			System.out.println(max);
			System.out.println("Stop");
		}
		
	}

}