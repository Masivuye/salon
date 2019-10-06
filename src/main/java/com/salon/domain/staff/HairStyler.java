package com.salon.domain.staff;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HairStyler {
    @Id
    @Column(name = "style_No")
    private int stylnum;
    @Column(name = "name")
    private String name;


    private HairStyler() {
    }

    private HairStyler(Builder builder) {
        this.name = builder.name;
        this.stylnum = builder.stylnum;
    }

    public String getName() {
        return name;
    }

    public int getStylnum() {
        return stylnum;
    }

    public static class Builder {
        private String name;
        private int stylnum;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder stylnum(int stylnum) {
            this.stylnum = stylnum;
            return this;
        }

        public HairStyler build() {
            return new HairStyler(this);
        }
    }

    @Override
    public String toString() {
        return "HairStyler{" +
                "name='" + name + '\'' +
                ",stylnum=" + stylnum +
                '}';
    }
}
