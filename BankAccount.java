class BankAccount 
{
    int balance = 1000; 
	

    public void deposit(int amount) 
	{
        balance += amount;
        System.out.print("Amount deposited ");
    }

    public void withdraw(int amount) 
	{
        if (amount <= balance) 
		{
            balance -= amount;
            System.out.print("Amount withdrawn ");
        }
		else 
		{
            System.out.print("Insufficient balance ");
        }
    }

    public void displayBalance() 
	{
        System.out.print("Balance = " + balance + " ");
    }
}