package com.solidImplementation.classes;
import com.solidImplementation.interfaces.*;
public class UpperBalcony implements Theatre , GiftVoucher
{
    @Override
    public void ticketInfo()
    {
        System.out.println("Thank you for purchasing Upper balcony ticket");
    }
    @Override
    public void voucher()
    {
        System.out.println("congo! you have won a gift voucher , use it to get free coke and popcorn");
    }
}
