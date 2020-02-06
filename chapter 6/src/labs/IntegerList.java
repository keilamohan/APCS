package labs;
// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create & fill
// a list of integers.
//          
// ****************************************************************

public class IntegerList
{
    int[] list; //values in the list
    int currentSpot;

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
		list = new int[size];
		currentSpot = 0;
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
		for (int i=0; i<list.length; i++)
		    list[i] = (int)(Math.random() * 100) + 1;
		currentSpot = list.length;
    }
    
    //-------------------------------------------------------
    //add element to list, check if increase in size is
    //needed first
    //-------------------------------------------------------
    public void addElement(int newValue)
    {
    	if(currentSpot >= list.length)
    		increaseSize();
    	list[currentSpot] = newValue;
    	currentSpot++;
    	
    }
    
    //-------------------------------------------------------
    //remove first instance of element from list
    //-------------------------------------------------------
    public void removeFirst(int newValue)
    {
    	//id where element is and shift values down
    	for(int spot = 0; spot < currentSpot; spot++)
    	{
    		if(list[spot] == newValue)
    		{
    			for(int i = spot; spot < currentSpot-1; spot++)
    			{
    				list[spot] = list[spot+1];
    			}
    			list[currentSpot-1] = 0;
    			currentSpot--;
    			break;
    		}
    	}
    	
    	//decrease capacity
    }
    
    //-------------------------------------------------------
    //remove all instances of element from list
    //-------------------------------------------------------
    public void removeAll(int newValue)
    {
    	int count = 0;
    	for(int spot = 0; spot < list.length; spot++)
    	{
    		if(list[spot] == newValue)
    			count++;
    	}
    	for(int i =0; i < count; i++)
    	{
    		removeFirst(newValue);
    	}
    }
    public void increaseSize()
    {
    	//create a new array with double size
    	int[] temp = new int[list.length*2];
    	
    	//fill new array values
    	for (int i = 0; i < list.length; i++)
    	{
    		temp[i] = list[i];
    	}
    	//set old array to new array
    	list = temp;
    }
    
   
    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
	for (int i=0; i<currentSpot; i++)
	    System.out.println(i + ":\t" + list[i]);
    }
}