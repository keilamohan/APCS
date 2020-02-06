package labs;

public class Name
{
	String first;
	String middle;
	String last;
	String name;
	
	public Name(String f, String m, String l)
	{
		first = f;
		middle = m;
		last = l;
		name = f + " " + m + " " + l;
	}
	
	public String getFirst()
	{
		return first;
	}
	
	public String getMiddle()
	{
		return middle;
	}
	
	public String getLast()
	{
		return last;
	}
	
	public String firstMiddleLast()
	{
		return first + " " + middle + " " + last;
	}
	
	public String lastFirstMiddle()
	{
		return last + ", " + first + " " + middle;
	}
	
	public boolean equals(Name otherName)
	{
		if (name.equalsIgnoreCase(otherName.firstMiddleLast()))
		{
			return true;
		}
		else
		{
			return false;
		}
	public String initials()
	{
		String firstInitial = first.substring(0,1);
		String middleInitial = middle.substring(0,1);
		String lastInitial = last.substring(0,1);
		return firstInitial.toUpperCase() + middleInitial.toUpperCase() + lastInitial.toUpperCase();
		
	}
	public int length ()
	{
		int nameLength = name.length();
		int length = 0;
		int i =0;
		
		while (nameLength> 0)
		{
			if (name.charAt(i) != ' ')
			{
				length++;
				
			}
		}
		return length;
	}
	
}

