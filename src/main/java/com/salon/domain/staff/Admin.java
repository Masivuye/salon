package com.salon.domain.staff;

import com.salon.domain.orders.Order;
import com.salon.domain.payment.Payment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
@Entity
public class Admin  {
    @Id
    @Column(name = "admin_num")
    private int Adnum;
    @Column(name = "name")
    private String name;

    private Admin() {
    }

    private Admin(Builder builder) {
        this.name = builder.name;
        this.Adnum = builder.Adnum;
    }

    public String getName() {
        return name;
    }

    public int getAdnum() {
        return Adnum;
    }

    public static class Builder {
        private String name;
        private int Adnum;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder Adnum(int Adnum) {
            this.Adnum = Adnum;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", Adnum=" + Adnum +
                '}';
    }
}
