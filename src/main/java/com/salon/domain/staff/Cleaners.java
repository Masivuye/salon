package com.salon.domain.staff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cleaners {
    @Id
    @Column(name = "cleaner_num")
    private int clnNum;
    @Column(name = "name")
    private String name;

    private Cleaners() {
    }

    private Cleaners(Builder builder) {
        this.name = builder.name;
        this.clnNum = builder.clnNum;
    }

    public String getName() {
        return name;
    }

    public int getClnNum() {
        return clnNum;
    }

    public static class Builder {
        private String name;
        private int clnNum;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder clnNum(int clnNum) {
            this.clnNum = clnNum;
            return this;
        }

        public Cleaners build() {
            return new Cleaners(this);
        }
    }

    @Override
    public String toString() {
        return "Cleaners{" +
                "name='" + name + '\'' +
                ", Adnum=" + clnNum +
                '}';
    }
}
