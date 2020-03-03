import static java.lang.System.*;

public class Monster1 implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

    //write a default Constructor
    public Monster1()
    {
        myWeight = 100;
        myHeight = 5;
        myAge = 10;
    }

	//write an initialization constructor with an int parameter ht
    public Monster1(int ht)
    {
        myWeight = 100;
        myHeight = ht;
        myAge = 10;
    }

	//write an initialization constructor with int parameters ht and wt
    public Monster1(int ht, int wt)
    {
        myWeight = wt;
        myHeight = ht;
        myAge = 10;
    }

	//write an initialization constructor with int parameters ht, wt, and age
    public Monster1(int ht, int wt, int age)
    {
        myWeight = wt;
        myHeight = ht;
        myAge = age;
    }

	//modifiers - write set methods for height, weight, and age
    public void setWeight(int wt)
    {
        myWeight = wt;
    }
    
    public void setHeight(int ht)
    {
        myHeight = ht;
    }
    
    public void setAge(int age)
    {
        myAge = age;
    }

	//accessors - write get methods for height, weight, and age
    public int getWeight()
    {
        return myWeight;
    }

    public int getHeight()
    {
        return myHeight;
    }

    public int getAge()
    {
        return myAge;
    }
	
	
	//creates a new copy of this Object
	public Object clone()
	{
        Monster(myHeight, myWeight, myAge)
	    return new Monster();
	}

	public boolean equals( Object obj )
	{
        if ()


		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;





		return -1;
	}

    //write a toString() method
    public String toString()
    {
        return "Monster:\nWeight: " + myWeight + "\nHeight" + myHeight + "\nAge: " + myAge;
    }
	
	
}