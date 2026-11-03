
package studentdetails;
class Institution
{
    String institutionName = "ABC Institution";

    class Student
    {
        String studentName;
        int rollNo;
        int marks[];
        double average;
        String grade;

        Scanner sc = new Scanner(System.in);

        // Add Student Details
        void addStudent()
        {
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Roll No: ");
            rollNo = sc.nextInt();

            System.out.print("Enter Number of Subjects: ");
            int n = sc.nextInt();

            marks = new int[n];
        }

        // Add Marks
        void addMarks()
        {
            if(marks == null)
            {
                System.out.println("Add Student Details First!");
            }
            else
            {
                System.out.println("Enter Marks:");

                for(int i = 0; i < marks.length; i++)
                {
                    marks[i] = sc.nextInt();
                }
            }
        }

        // Calculate Average and Grade
        void calculateGrade()
        {
            if(marks == null)
            {
                System.out.println("Add Student Details First!");
            }
            else
            {
                int sum = 0;

                for(int i = 0; i < marks.length; i++)
                {
                    sum = sum + marks[i];
                }

                average = (double)sum / marks.length;

                if(average >= 90)
                {
                    grade = "A";
                }
                else if(average >= 75)
                {
                    grade = "B";
                }
                else if(average >= 50)
                {
                    grade = "C";
                }
                else
                {
                    grade = "Fail";
                }

                System.out.println("Grade Calculated Successfully!");
            }
        }

        // Display Student Details
        void displayDetails()
        {
            if(marks == null)
            {
                System.out.println("Add Student Details First!");
            }
            else
            {
                System.out.println("\nInstitution Name: " + institutionName);
                System.out.println("Student Name: " + studentName);
                System.out.println("Roll No: " + rollNo);

                System.out.print("Marks: ");

                for(int i = 0; i < marks.length; i++)
                {
                    System.out.print(marks[i] + " ");
                }

                System.out.printf("\nAverage: %.2f", average);

                if(grade == null)
                {
                    System.out.println("\nGrade: Not Calculated");
                }
                else
                {
                    System.out.println("\nGrade: " + grade);
                }
            }
        }
    }