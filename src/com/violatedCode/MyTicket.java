package com.violatedCode;

public class MyTicket extends Theatre
{
    public void upperBalcony()
    {
        super.welcome();
        System.out.println("Thanks for purchasing upperbalcony ticket");
        super.voucher();
    }
    public void lowerBalocny()
    {
        super.welcome();
        System.out.println("Thanks for purchasing lowerbalcony tickets");
        super.voucher();
    }
    public void lowClass()
    {
        super.welcome();
        System.out.println("Thanks for purchasing the lowerbalcony ticket");
    }
}
