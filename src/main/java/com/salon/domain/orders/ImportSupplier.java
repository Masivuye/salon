package com.salon.domain.orders;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ImportSupplier {
    @Id
    @Column(name = "shiped_num")
    private int shipedNum;
    @Column(name = "name")
    private String name;

    private ImportSupplier() {
    }

    private ImportSupplier(Builder builder) {
        this.name = builder.name;
        this.shipedNum = builder.shipedNum;
    }

    public String getName() {
        return name;
    }

    public int getShipedNum() {
        return shipedNum;
    }

    public static class Builder {
        private String name;
        private int shipedNum;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder shipedNum(int shipedNum) {
            this.shipedNum = shipedNum;
            return this;
        }

        public ImportSupplier build() {
            return new ImportSupplier(this);
        }
    }

    @Override
    public String toString() {
        return "ImportSupplier{" +
                "name='" + name + '\'' +
                ", impSupNum=" + shipedNum +
                '}';
    }
}
