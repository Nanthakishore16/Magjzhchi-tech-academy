class LinearSearch
{
	public static void main(String args [])
	{
		
		int ar[] = {3,4,5,6,7,8,9,10};
		int target = 8;
		
		for(int i = 0;i<ar.length;i++)
		{
			
			if(ar[i] == target)
			{
				
				System.out.println(i);
				
			}
		}
	}
	
}