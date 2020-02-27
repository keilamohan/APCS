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
            for (int i = 0; numElements(i) >= value; i++)
            {
                newList=x[0];
                n = numElements.getSize() +1;
                for(int j=0;i<n-1;j++)
                {
                    x[j]=x[j+1];
                }
                x[j] =newList;
            }
                list[numElements] = value;
                numElements++;
            }

	    }
    }
}