class Fibonaccis 
{
    static void printFibonacci(int n) 
	{
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci series: ");

        for (int i = 0; i < n; i++) 
		{
            System.out.print(first);

            if (i < n - 1) 
			{
                System.out.print(" ");
            }

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) 
	{
        int n = 5;
        System.out.println("Enter number of terms: " + n);
        printFibonacci(n);
    }
}