package com.salon.domain.hair;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Set;
@Entity
public class GirlsHair {
    @Id
    @Column(name = "type")
    private String types;
    @Column(name = "price")
    private double price;


    private GirlsHair(){}

    private GirlsHair(Builder builder){
        this.price = builder.price;
        this.types = builder.types;
    }

    public double getPrice() {
        return price;
    }

    public String getTypes() {
        return types;
    }

    public static class Builder{
        private double price;
        private String types;


        public Builder price(double price){
            this.price = price;
            return this;
        }
        public Builder types(String types){
            this.types = types;
            return this;
        }
        public GirlsHair build(){
            return new GirlsHair(this);
        }
    }

    @Override
    public String toString() {
        return "GirlsHair{" +
                "price=" + price +
                ", types=" + types +
                '}';
    }
}
