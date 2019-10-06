package com.salon.domain.staff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
    @Id
    @Column(name  = "staff_number")
    private int staffNumber;
    @Column(name = "name")
    private String names;

    private Staff(){}


    private Staff(Builder builder){
        this.names = builder.names;
        this.staffNumber = builder.staffNumber;

    }

    public String getName() {
        return names;
    }

    public int getStaffNumber() {
        return staffNumber;
    }
    public static class Builder{
        private String names;
        private int staffNumber;

        public Builder name(String name) {
            this.names = names;
            return this;
        }
        public Builder staffNumber(int staffNumber){
            this.staffNumber = staffNumber;
            return this;
        }
        public Staff build(){
            return new Staff(this);
        }
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + names + '\'' +
                ", staffNumber=" + staffNumber +
                '}';
    }
}
