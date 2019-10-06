package com.salon.domain.booking;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Booking {

   @Id
    @Column(name = "booking_Number")
    private int bookingNumber;
    @Column(name = "booking_Date")
    private Date date;


    private Booking(){}

    private Booking(Builder builder){
        this.date = builder.date;
        this.bookingNumber = builder.bookingNumber;
    }

    public Date getDate() {
        return date;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public static class Builder{
        private int bookingNumber;
        private Date date;

        public Builder bookingNumber(int bookingNumber){
            this.bookingNumber = bookingNumber;
            return this;
        }
        public Builder date(Date date){
            this.date = date;
            return this;
        }
        public Builder copy(Booking booking){
            this.date = booking.date;
            this.bookingNumber = booking.bookingNumber;

            return this;
        }
        public Booking build(){
            return new Booking(this);
        }
    }

    @Override
    public String toString() {
        return "Booking{" +
                "date=" + date +
                ", bookingNumber=" + bookingNumber +
                '}';
    }
}
