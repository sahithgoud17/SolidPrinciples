package com.solidImplementation.classes;
import com.solidImplementation.interfaces.*;

public class LowClass implements Theatre
{
    @Override
    public void ticketInfo()
    {
        System.out.println("Thank you for purchasing the ticket");
    }
}
