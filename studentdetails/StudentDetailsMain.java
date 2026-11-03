
package studentdetails;

public class StudentDetailsMain 
{

    public static void main(String[] args) 
    {
        Institution ins = new Institution();

        Institution.Student s = ins.new Student();

        Scanner sc = new Scanner(System.in);

        int choice;

        do
        {
            System.out.println("\n----- STUDENT MANAGEMENT -----");
            System.out.println("1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            if(choice == 1)
            {
                s.addStudent();
            }
            else if(choice == 2)
            {
                s.addMarks();
            }
            else if(choice == 3)
            {
                s.calculateGrade();
            }
            else if(choice == 4)
            {
                s.displayDetails();
            }
            else if(choice == 5)
            {
                System.out.println("Thank You!");
            }
            else
            {
                System.out.println("Invalid Choice!");
            }

        } while(choice != 5);
    }
}  
    
    

