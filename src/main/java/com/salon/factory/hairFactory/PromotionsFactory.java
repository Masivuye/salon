package com.salon.factory.hairFactory;

import com.salon.domain.hair.Promotions;

public class PromotionsFactory {
    public static String product = "Shampoo";

    public static Promotions getPromotions(String products){
        return new Promotions.Builder()
                .types(product).build();
    }
}
