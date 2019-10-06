package com.salon.domain.hair;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Set;
@Entity
public class Promotions {
    @Id
    @Column(name = "prom_Code")
    private int promCode;
    @Column(name = "products")
    private String products;


    private Promotions(){}

    private Promotions(Builder builder){
        this.products = builder.products;
        this.promCode = builder.promCode;

    }

    public String getProducts() {
        return products;
    }
    public int getPromCode(){
        return promCode;
    }


    public static class Builder{

        private String products;
        private int promCode;

        public Builder types(String products){
            this.products = products;
            return this;
        }
        public Builder promCode(int promCode){
            this.promCode = promCode;
            return this;
        }
        public Promotions build(){
            return new Promotions(this);
        }
    }

    @Override
    public String toString() {
        return "Promotions{" +
                "products=" + products +
                "PromotionCode"+ promCode+
                '}';
    }
}
