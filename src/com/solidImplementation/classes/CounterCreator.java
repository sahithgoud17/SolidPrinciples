package com.solidImplementation.classes;

public class CounterCreator
{
    public Counter1 getCounter1(String getCounter)
    {
        if(getCounter.equalsIgnoreCase("Where can i get upper balcony ticket"))
        {
            return new Counter1();
        }
        else
            return null;
    }

    public Counter2 getCounter2(String getCounter)
    {
        if(getCounter.equalsIgnoreCase("where can i get lower balcony ticket"))
        {
            return new Counter2();
        }
        else
            return null;
    }

    public Counter3 getCounter3(String getCounter)
    {
        if(getCounter.equalsIgnoreCase("Where can i get low class ticket"))
        {
            return new Counter3();
        }
        else
            return null;
    }
}
