package com.salon.domain.manicure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nails {
    @Id
    private int nailCode;
    @Column(name = "shape")
    private String shapes;
    @Column(name = "color")
    private String colors;


    private Nails() {
    }

    private Nails(Builder builder) {
        this.colors = builder.colors;
        this.shapes = builder.shapes;

    }

    public String getShapes() {
        return shapes;
    }

    public String getColors() {
        return colors;
    }

    public static class Builder {

        private String shapes;
        private String colors;


        public Builder shapes(String shapes) {
            this.shapes = shapes;
            return this;
        }

        public Builder colors(String colors) {
            this.colors = colors;
            return this;
        }

        public Nails build() {
            return new Nails(this);
        }
    }

    @Override
    public String toString() {
        return "Nails{" +
                "shapes=" + shapes +
                ", colors=" + colors +
                '}';
    }
}
