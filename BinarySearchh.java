class BinarySearchh
{
	public static void main(String[]args)
	{
		int ar[] = {1,2,3,4,5,6,7,8};
		int target = 9;
		
		int start = 0;
		int end = ar.length-1;
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(ar[mid] == target)
			{
				System.out.println(mid);
				break;
			}
			else if(ar[mid]>target)
			{
				end = mid-1;
			}
			else if(ar[mid]<target)
			{
				start = mid+1;
			}
		}
		
		if(start>end)
		{
			System.out.println("Not found");
		}
	}
}