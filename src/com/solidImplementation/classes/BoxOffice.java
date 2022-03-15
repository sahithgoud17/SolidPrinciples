package com.solidImplementation.classes;

public class BoxOffice
{
    public UpperBalcony getTicket(String ticket)
    {
        if(ticket.equalsIgnoreCase("I need upperbalcony ticket"))
            return new UpperBalcony();
        else return null;
    }
    public LowerBalcony getTicket1(String ticket)
    {
        if(ticket.equalsIgnoreCase("I need lowerbalcony ticket"))
            return new LowerBalcony();
        else return null;
    }
    public LowClass getTicket2(String ticket)
    {
        if(ticket.equalsIgnoreCase("I need lowclass ticket"))
            return new LowClass();
        else return null;
    }
}
