package com.salon.domain.orders;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
    @Id
    @Column(name = "sup_num")
    private int supNum;
    @Column(name = "name")
    private String name;

    private Supplier() {
    }

    private Supplier(Builder builder) {
        this.name = builder.name;
        this.supNum = builder.supNum;
    }

    public String getName() {
        return name;
    }

    public int getSupNum() {
        return supNum;
    }

    public static class Builder {
        private String name;
        private int supNum;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder supNum(int supNum) {
            this.supNum = supNum;
            return this;
        }

        public Supplier build() {
            return new Supplier(this);
        }
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", supNum=" + supNum +
                '}';
    }
}
