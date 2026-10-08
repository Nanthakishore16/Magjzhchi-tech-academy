
class Student
{
    String name;
    int rollNo;

    void addStudent(String n, int r)
    {
        name = n;
        rollNo = r;
        System.out.println("Student details saved");
    }

    void updateName(String n)
    {
        name = n;
    }

    void displayStudent()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}


