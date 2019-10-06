package com.salon.domain.booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

   @Id
   @Column(name = "customer_Number")
    private int custNumber;
   @Column(name = "customer_Name")
    private String name;

    private Customer() {
    }

    private Customer(Builder builder) {
        this.name = builder.name;
        this.custNumber = builder.custNumber;
    }

    public String getName() {
        return name;
    }

    public int getCustNumber() {
        return custNumber;
    }

    public static class Builder {
        private String name;
        private int custNumber;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder custNumber(int custNumber) {
            this.custNumber = custNumber;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", custNumber=" + custNumber +
                '}';
    }
}

