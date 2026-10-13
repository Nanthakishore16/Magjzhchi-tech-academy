public class Main 
{
    public static void main(String[] args) 
	{
        BankAccount account = new BankAccount();

        for (int i = 0; i < args.length; ) 
		{
			
            int choice = Integer.parseInt(args[i]);
            switch (choice) 
			{
                case 1:
                    int depAmount = Integer.parseInt(args[i + 1]);
                    account.deposit(depAmount);
                    i += 2; 
                    break;
                case 2:
                    int witAmount = Integer.parseInt(args[i + 1]);
                    account.withdraw(witAmount);
                    i += 2; 
                    break;
                case 3:
                    account.displayBalance();
                    i += 1; 
					
                    break;
                case 4:
                    System.out.print("Exit");
                    return;
                default:
                    i += 1;
            }
        }
    }
}