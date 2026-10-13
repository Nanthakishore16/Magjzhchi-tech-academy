abstract class Employee 
{
    String name;

    public Employee(String name) 
	{
        this.name = name;
    }

   
    abstract double calculateSalary();

    
    public void displayEmployee() 
	{
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee 
{
    double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) 
	{
        super(name);
        this.monthlySalary = monthlySalary;
    }

    
    double calculateSalary() {
        return monthlySalary;
    }
}


class PartTimeEmployee extends Employee 
{
    double hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(String name, double hoursWorked, double hourlyRate) 
	{
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

   
    double calculateSalary() 
	{
        return hoursWorked * hourlyRate;
    }
}