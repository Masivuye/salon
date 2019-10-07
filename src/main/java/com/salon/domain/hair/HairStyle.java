package com.salon.domain.hair;

import com.salon.domain.booking.Customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Set;
@Entity
public class HairStyle {
    @Id
    @Column(name = "styl_code")
    private int stleCode;
    @Column(name = "type")
    private String types;
    @Column(name = "price")
    private double price;

    private HairStyle(){}

    private HairStyle(Builder builder){
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
        public HairStyle build(){
            return new HairStyle(this);
        }
    }

    @Override
    public String toString() {
        return "HairStyle{" +
                "price=" + price +
                ", types=" + types +
                '}';
    }
}
