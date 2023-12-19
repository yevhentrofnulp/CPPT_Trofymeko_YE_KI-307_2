package ki307.Trofymenko.Lab6;

import java.util.ArrayList;
import java.util.List;

public class Suitcase<T extends Item, T1 extends myinterface,T2 extends myinterface>
{
    private final List<T> arr;

    public Suitcase()
    {
        arr = new ArrayList<T>();
    }

    public T FindMin()
    {
        if (arr.isEmpty())
        {
            return null;
        }
        else
        {
            T min = arr.get(0);
            for (int i = 1; i < arr.size(); i++)
            {
                if (arr.get(i).getVolume() < min.getVolume())
                {
                    min = arr.get(i);
                }
            }
            return min;
        }
    }

    public void AddItem(T item)
    {
        arr.add(item);
        var index = arr.indexOf(item);
        System.out.print("Element was added: index - " + index + "; ");
        item.PrintInfo();
    }

    public void DeleteItem(int i)
    {
        System.out.print("Element on index " + i + " was deleted: ");
        arr.get(i).PrintInfo();
        arr.remove(i);
    }

    public void PrintAllItems()
    {
        for(T el : arr)
        {
            el.PrintInfo();
        }
    }
    public void PrintData(String data1, Integer data2) {
    	
    System.out.println("Data1: " + data1);
    System.out.println("Data2: " + data2);
    }
}