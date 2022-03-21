package com.solidImplementation.classes;

public class Main
{
    public static void main(String[] args)
    {
        CounterCreator counterCreator = new CounterCreator();
        Counter1 counter1 = counterCreator.getCounter1("where can i get upper balcony ticket");
        UpperBalcony upperBalconyTicket = counter1.getUpperBalcony("i need upper balcony ticket");
        upperBalconyTicket.ticketInfo();
        upperBalconyTicket.voucher();

        System.out.println();

        Counter2 counter2 = counterCreator.getCounter2("where can i get lower balcony ticket");
        LowerBalcony lowerBalcony = counter2.getLowerBalcony("i need lower balcony ticket");
        lowerBalcony.ticketInfo();
        lowerBalcony.voucher();

        System.out.println();

        Counter3 counter3 = counterCreator.getCounter3("where can i get low class ticket");
        LowClass lowClass = counter3.getLowClass("i need low class ticket");
        lowClass.ticketInfo();
    }
}
