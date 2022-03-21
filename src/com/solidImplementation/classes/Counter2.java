package com.solidImplementation.classes;


import com.solidImplementation.interfaces.AbstractFactory;

class Counter2 implements AbstractFactory
{
    public UpperBalcony getUpperBalcony(String getTicket)
    {
        return null;
    }
    public LowClass getLowClass(String getTicket)
    {
        return null;
    }
    public LowerBalcony getLowerBalcony(String getTicket)
    {
        if(getTicket.equalsIgnoreCase("i need lower balcony ticket"))
            return new LowerBalcony();
        else
            return null;
    }

}
