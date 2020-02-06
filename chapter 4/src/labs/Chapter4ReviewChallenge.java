package labs;

// class
public class Resume
{
	// initializing instance data
	private String name;
	private int age;
	private int grade;
	private int sat;
	
	// default constructor
	public Resume()
	{
		name = John Doe;
		grade = 1;
		age = 1;
		sat = 400;
	}
	public Resume(String n, int a, int g, int s)
	{
		// declaring instance data
		name = n;
		age = a;
		grade = g;
		sat = s;
			
	}
	
	// accessors
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	public int getYear()
	{
		if(grade == 9)
		{
			return 2023;
		}
		if(grade == 10)
		{
			return 2022;
		}
		if(grade == 11)
		{
			return 2021;
		}
		if(grade == 12)
		{
			return 2020;
		}
	}
	public int getGrade()
	{
		return grade;
	}
	//method overloading
	public String getSat(boolean taken)
	{
		if (taken)
		{
			return "SAT was taken";
		}
		else
		{
			return "SAT was not taken";
		}
	}
	public int getSat()
	{
		return sat;
	}
	// preconditions: name is John Doe, grade is 1, age is 1, sat score is 400
	// postconditions: name, grade, age, sat score is changed to what the user enters

}
