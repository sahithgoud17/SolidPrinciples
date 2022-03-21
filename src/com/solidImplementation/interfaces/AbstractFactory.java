package com.solidImplementation.interfaces;

import com.solidImplementation.classes.LowClass;
import com.solidImplementation.classes.LowerBalcony;
import com.solidImplementation.classes.UpperBalcony;

public interface AbstractFactory
{
   UpperBalcony getUpperBalcony(String getTicket);
   LowerBalcony getLowerBalcony(String getTicket);
   LowClass getLowClass(String getTicket);
}
