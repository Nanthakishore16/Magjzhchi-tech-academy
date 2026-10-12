class Person 
{
    String name;
    int age;

   
   
    public Person(String name, int age) 
	{
        this.name = name;
        this.age = age;
    }
}

class Student extends Person 
{
    int rollNumber;
    double marks;

   
    public Student(String name, int age, int rollNumber, double marks) 
	{
        super(name, age); 
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void display() 
	{
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks);
    }
}