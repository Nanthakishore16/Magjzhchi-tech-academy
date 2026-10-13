class EmpolyeeMain 
{
	public static void main(String[] args) 
	{
      Employee fullTimeEmp = new FullTimeEmployee("Alice Smith", 4500.0);
        fullTimeEmp.displayEmployee();
        System.out.println("Monthly Salary: $" + fullTimeEmp.calculateSalary());

		Employee partTimeEmp = new PartTimeEmployee("Bob Jones", 80, 20.0);
        partTimeEmp.displayEmployee();
    }
}