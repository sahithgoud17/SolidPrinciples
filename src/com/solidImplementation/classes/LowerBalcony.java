package com.solidImplementation.classes;
import com.solidImplementation.interfaces.*;

public class LowerBalcony implements Theatre , GiftVoucher
{
    @Override
    public void ticketInfo()
    {
        System.out.println("Thank you for purchasing Lower balcony ticket");
    }

    @Override
    public void voucher()
    {
        System.out.println("congo! you have won a gift voucher , use it to get a coke");
    }
}

