package com.solidImplementation.classes;


class Counter2
{
    public LowerBalcony getTicket2(String getTick)
    {
        if(getTick.equalsIgnoreCase("i need lowerbalcony ticket"))
            return new LowerBalcony();
        else
            return null;
    }

}
