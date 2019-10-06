package com.salon.domain.manicure;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Massage {
    @Id
    @Column(name = "massageCode")
    private int massageCode;
    @Column(name = "type")
    private String types;

    private Massage() {
    }

    private Massage(Builder builder) {
        this.types = builder.types;
        this.massageCode = builder.massageCode;


    }

    public String getTypes() {
        return types;
    }
    public int getMassageCode(){
        return massageCode;
    }

    public static class Builder {

        private String types;
        private int massageCode;

        public Builder types(String types) {
            this.types = types;
            return this;
        }
        public Builder massageCode(int massageCode){
            this.massageCode = massageCode;
            return this;
        }

        public Massage build() {
            return new Massage(this);
        }
    }

    @Override
    public String toString() {
        return "Massage{" +
                "MassageCode" + massageCode+
                "types=" + types +
                '}';
    }
}
