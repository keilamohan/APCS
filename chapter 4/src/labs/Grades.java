package labs;
// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
	Student student1 = new Student("Mary");
	Student student2 = new Student("Mike"); //create student2, "Mike"

	
	System.out.println("Student 1: "+ student1.printName());
	student1.inputGrades();
	
	System.out.println("The average score for " + student1.printName() + " is " + student1.getAverage());
	System.out.println(student1.toString());


	System.out.println();
	
	System.out.println("Student 2: "+ student2.printName());
	student2.inputGrades();
	System.out.println("The average score for " + student2.printName() + " is " + student2.getAverage());
	System.out.println(student2.toString());

    }
}