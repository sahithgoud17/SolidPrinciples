package com.solidImplementation.classes;


class Counter3
{
    public LowClass getTicket3(String getTick)
    {
        if(getTick.equalsIgnoreCase("i need lowclass ticket"))
            return new LowClass();
        else
            return null;
    }
}
