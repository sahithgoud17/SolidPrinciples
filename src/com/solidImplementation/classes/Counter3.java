package com.solidImplementation.classes;


import com.solidImplementation.interfaces.AbstractFactory;

class Counter3 implements AbstractFactory
{
    public UpperBalcony getUpperBalcony(String getTicket)
    {
        return null;
    }
    public LowClass getLowClass(String getTicket)
    {
        if(getTicket.equalsIgnoreCase("i need low class ticket"))
            return new LowClass();
        else
            return null;
    }
    public LowerBalcony getLowerBalcony(String getTicket)
    {
        return null;
    }

}
