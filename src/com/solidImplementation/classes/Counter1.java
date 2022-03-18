package com.solidImplementation.classes;


class Counter1
{
    public UpperBalcony getTicket1(String getTick)
    {
        if(getTick.equalsIgnoreCase("i need upperbalcony ticket"))
            return new UpperBalcony();
        else
            return null;
    }

}
