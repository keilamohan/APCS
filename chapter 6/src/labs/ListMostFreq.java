package labs;

import java.util.*;

public class ListMostFreq
{
    public static int sortRun( List<Integer> ray)
    {
        Collections.sort(ray);
        System.out.println(ray);
        int max = 1;
        int maxNum = ray.get(0);
        int current = 0;
        int currentValue = ray.get(0);
        for (int i = 1; i < ray.size(); i++)
        {
            if (ray.get(i) == ray.get(i - 1))
            {
                current++;
                currentValue = ray.get(i);
            }
            
            if (current > max)
            {
                max = current;
                maxNum = currentValue;
            }
            return maxNum;
        }
    }
    public static int go( List<Integer> ray )
    {
        int max = -1;
        int maxNum = ray.get(0);
        int current = 1;
        for(int i = 0; i < ray.size(); i++)
        {
            for(int k = i; k < ray.size(); k++)
            {
                if (ray.get(i) == ray.get(j))
                {
                    current++;
                }
                if (current > maxNum)
                {
                    max = current;
                    maxNum = ray.get(i);
                }
            }
            current = 0;
        }
        return maxNum;
}
