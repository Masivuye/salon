package com.salon.domain.manicure;


import com.salon.domain.booking.Customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Set;
@Entity
public class Manicure {
    @Id
    private int maniCode;
    @Column(name = "type")
    private String types;
    @Column(name = "color")
    private String colors;


    private Manicure() {
    }

    private Manicure(Builder builder) {
        this.types = builder.types;
        this.colors = builder.colors;

    }

    public String getColors() {
        return colors;
    }

    public String getTypes() {
        return types;
    }

    public static class Builder {

        private String colors;
        private String types;
        private Set<Customer> customers;

        public Builder colors(String colors) {
            this.colors = colors;
            return this;
        }

        public Builder types(String types) {
            this.types = types;
            return this;
        }

        public Manicure build() {
            return new Manicure(this);
        }
    }

    @Override
    public String toString() {
        return "Manicure{" +
                "colors=" +colors +
                ", types=" + types +
                '}';
    }
}
