package com.solidImplementation.classes;

public class SolidImplementation
{
    public static void main(String[] args)
    {
        Counter1 c1 = new Counter1();
        UpperBalcony ub = c1.getTicket1("i need upperbalcony ticket");
        ub.ticketInfo();
        ub.voucher();

        Counter2 c2 = new Counter2();
        LowerBalcony lb = c2.getTicket2("i need lowerbalcony ticket");
        lb.ticketInfo();
        lb.voucher();

        Counter3 c3 = new Counter3();
        LowClass lc = c3.getTicket3("i need lowclass ticket");
        lc.ticketInfo();
    }
}
