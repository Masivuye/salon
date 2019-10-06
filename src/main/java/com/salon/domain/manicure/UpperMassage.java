package com.salon.domain.manicure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UpperMassage {
    @Id
    @Column(name = "uppermassagecode")
    private int upperMassageCode;
    @Column(name = "price")
    private double price;


    private UpperMassage() {
    }

    private UpperMassage(Builder builder) {
        this.price = builder.price;
        this.upperMassageCode = builder.upperMassageCode;


    }

    public Double getPrice() {
        return price;
    }
    public int getUpperMassageCode(){return upperMassageCode;}

    public static class Builder {

        private int upperMassageCode;
        private double price;



        public Builder price(double price) {
            this.price = price;
            return this;
        }
        public Builder upperMassageCode(int upperMassageCode){this.upperMassageCode = upperMassageCode;
        return this;}

        public UpperMassage build() {
            return new UpperMassage(this);
        }
    }

    @Override
    public String toString() {
        return "UpperMassage{" +
                "upperMCode"+ upperMassageCode+
                "price=" + price +
                '}';
    }
}
