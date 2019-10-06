package com.salon.factory.manicureFactory;

import com.salon.domain.manicure.Massage;

public class MassageFactory {
   private static String types = " ";

    public static Massage getMassage(String typ){
        return new Massage.Builder()
                .types(types)
                .build();
    }

}
