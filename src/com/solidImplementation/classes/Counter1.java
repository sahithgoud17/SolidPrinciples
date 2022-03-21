package com.solidImplementation.classes;


import com.solidImplementation.interfaces.AbstractFactory;

class Counter1 implements AbstractFactory
{
    public UpperBalcony getUpperBalcony(String getTicket)
    {
        if(getTicket.equalsIgnoreCase("i need upper balcony ticket"))
            return new UpperBalcony();
        else
            return null;
    }
    public LowClass getLowClass(String getTicket)
    {
        return null;
    }
    public LowerBalcony getLowerBalcony(String getTicket)
    {
        return null;
    }

}
