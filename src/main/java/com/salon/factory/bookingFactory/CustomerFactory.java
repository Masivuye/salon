package com.salon.factory.bookingFactory;

import com.salon.domain.booking.Customer;
import com.salon.domain.hair.HairStyle;
import com.salon.domain.manicure.Manicure;

public class CustomerFactory {
    public static Customer getCustomer(String name, int custNumber){
        return new Customer.Builder().name("Masivuye")
                .custNumber(211210471)
                .build();
    }


}
