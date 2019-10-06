package com.salon.domain.manicure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
@Entity
public class FullMassage {
    @Id
    @Column(name = "massageCode")
    private int massageCode;
    @Column(name = "price")
    private double price;


    private FullMassage() {
    }

    private FullMassage(Builder builder) {
        this.price = builder.price;
        this.massageCode = massageCode;


    }


    public double getPrice() {
        return price;
    }
    public int getMassageCode(){
        return massageCode;
    }

    public static class Builder {

        private double price;
        private int massageCode;



        public Builder price(double price) {
            this.price = price;
            return this;
        }
        public Builder massageCode(int massageCode)
        {
            this.massageCode = massageCode;
            return this;
        }

        public FullMassage build() {
            return new FullMassage(this);
        }
    }

    @Override
    public String toString() {
        return "FullMassage{" +
                "price=" + price +
                "MassageCode" + massageCode+
                '}';
    }
}
