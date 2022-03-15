package com.solidImplementation.classes;

public class SolidImplementation
{
    public static void main(String[] args)
    {
        BoxOffice bo = new BoxOffice();
        UpperBalcony ub = bo.getTicket("i need upperbalcony ticket");
        ub.ticketInfo();
        ub.voucher();
        LowerBalcony lb = bo.getTicket1("i need lowerbalcony ticket");
        lb.ticketInfo();
        lb.voucher();
        LowClass lc = bo.getTicket2("i need lowclass ticket");
        lc.ticketInfo();
    }
}
