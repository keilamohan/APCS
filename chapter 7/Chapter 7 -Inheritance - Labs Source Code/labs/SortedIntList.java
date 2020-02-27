public class SortedIntList extends IntList
{
    public SortedIntList(int size)
    {
        super(size);
    }

    public void add(int value)
    {
	if (numElements == list.length)
	    System.out.println("Can't add, list is full");
    else
    {

	    {

            for (int i = 0; i < numElements; i++)
            {
                if (list[i] >= value)
                {
                    for(int j = numElements; j > i; j--)
                    {
                        list[j] = list[j-1];
                    }
                }

            }
            list[numElements] = value;
            numElements++;
        }
        
    }
}
}
    