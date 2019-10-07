package com.salon.domain.hair;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "boys_cut")
public class BoysCut {
    @Id
    private int boysCode;
    @Column(name = "type")
    private String types;
    @Column(name = "price")
    private double price;


    private BoysCut(){}

    private BoysCut(Builder builder){
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
        public BoysCut build(){
            return new BoysCut(this);
        }
    }

    @Override
    public String toString() {
        return "BoysCut{" +
                "price=" + price +
                ", types=" + types +
                '}';
    }
}
