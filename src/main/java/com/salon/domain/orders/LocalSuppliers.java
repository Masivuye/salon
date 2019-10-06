package com.salon.domain.orders;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LocalSuppliers {
    @Id
    @Column(name = "loc_sup_num")
    private int locSupNum;
    @Column(name = "name")
    private String name;

    private LocalSuppliers() {
    }

    private LocalSuppliers(Builder builder) {
        this.name = builder.name;
        this.locSupNum = builder.locSupNum;
    }

    public String getName() {
        return name;
    }

    public int getLocSupNum() {
        return locSupNum;
    }

    public static class Builder {
        private String name;
        private int locSupNum;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder locSupNum(int locSupNum) {
            this.locSupNum = locSupNum;
            return this;
        }

        public LocalSuppliers build() {
            return new LocalSuppliers(this);
        }
    }

    @Override
    public String toString() {
        return "LocalSuppliers{" +
                "name='" + name + '\'' +
                ", locSupNum=" + locSupNum +
                '}';
    }
}
