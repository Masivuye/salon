package com.salon.domain.orders;
import com.salon.domain.staff.Admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;
@Entity
@Table(name = "orderTable")
public class Order {
    @Id
    @Column(name = "order_num")
    private int order_num;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;

    private Order() {
    }

    private Order(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.order_num = builder.order_num;
    }

    public String getName() {
        return name;
    }
    public int getOrder_num(){return order_num;}

    public double getPrice() {
        return price;
    }

    public static class Builder {
        private String name;
        private double price;
        private int order_num;


        public Builder order_num(int order_num){
            this.order_num = order_num;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "Oder Number"+ order_num+
                "name='" + name  +
                ", price=" + price +
                '}';
    }
}
