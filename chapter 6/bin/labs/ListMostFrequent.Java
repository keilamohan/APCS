package labs;

import java.util.*;

public class ListMostFrequent
{

    public static int go(List<Integer>ray)
    {
		int maxCount = -1;
		int max = ray.get(0);
		int currentCount = 1;
        for(int i = 0; i < ray.size(); i++)
        {
            for(int k = i; j < ray.size(); k++)
            {
                if (ray.get(i) == ray.get(k))
                {
					currentCount++;
				}
                if (currentCount > maxCount)
                {
					maxCount = currentCount;
					max = ray.get(i);
				}
			}
			currentCount = 0;
		}
		return max;
	}
}