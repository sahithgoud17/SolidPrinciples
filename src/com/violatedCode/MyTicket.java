package com.violatedCode;

public class MyTicket extends Theatre
{
    public void upperBalcony()
    {

        System.out.println("Thanks for purchasing upperbalcony ticket");
        super.voucher();
    }
    public void lowerBalocny()
    {

        System.out.println("Thanks for purchasing lowerbalcony tickets");
        super.voucher();
    }
    public void lowClass()
    {

        System.out.println("Thanks for purchasing the lowerbalcony ticket");
    }
}
