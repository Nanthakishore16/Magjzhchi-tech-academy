public class LargestElement 
{
    public static void main(String[] args) 
	{
        int[][] numbers = {
            {1, 8, 3},
            {4, 2, 6}
        };

        int largest = numbers[0][0];

       
        for (int i = 0; i < numbers.length; i++) 
		{
            for (int j = 0; j < numbers[i].length; j++) 
			{
                if (numbers[i][j] > largest) {
                    largest = numbers[i][j];
                }
            }
        }

        System.out.println("Largest = " + largest);
    }
}