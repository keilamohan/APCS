package labs;
// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student’s info. 
// ****************************************************************
import java.util.Scanner;

public class Student
{
    private String name;
    private int score1, score2;
	
	//declare instance data 

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    Scanner scan = new Scanner(System.in);
    
    public Student(String studentName)
    {
    	name = studentName; //add body of constructor
    }
    


    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
    	System.out.println("Enter in " + name + "'s score for test 1: ");
    	score1 = scan.nextInt();
    	System.out.println("Enter in " + name + "'s score for test 2: ");
        score2 = scan.nextInt();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    public double getAverage()
    {
	
    	double average = (score1 + score2)/2; //add body of getAverage
    	return average;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    public String printName()
    {
    	return name;//add body of printName
    }
    
    public String toString()
    {
    	return "Name: " + name + "\tTest1: " + score1 + "\tTest2: " + score2;
    }

}