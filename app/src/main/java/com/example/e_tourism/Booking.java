package com.example.e_tourism;
public class Booking {
    String guestid;
    String guestFullName;
    String guestEmail;
    String guestAddress;
    String guestDob;
    String guestSelect;
    String guestCheckIn;
    String guestCheckOut;


    public Booking(){
        //this constructor is required
    }

    public Booking(String guestid, String guestFulltName, String guestEmail, String guestAddress, String guestDob, String guestSelect, String guestCheckIn, String guestCheckOut) {
        this.guestid = guestid;
        this.guestFullName = guestFulltName;
        this.guestEmail = guestEmail;
        this.guestAddress = guestAddress;
        this.guestDob = guestDob;
        this.guestSelect = guestSelect;
        this.guestCheckIn = guestCheckIn;
        this.guestCheckOut = guestCheckOut;
    }

    public String getGuestid() {
        return guestid;
    }

    public String getGuestFullName() {
        return guestFullName;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public String getGuestAddress() {
        return guestAddress;
    }

    public String getGuestDob() {
        return guestDob;
    }

    public String getGuestSelect() {
        return guestSelect;
    }

    public String getGuestCheckIn() {
        return guestCheckIn;
    }

    public String getGuestCheckOut() {
        return guestCheckOut;
    }
}
