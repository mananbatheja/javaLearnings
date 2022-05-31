package com.example.OneToOneJPAEmployee;


import javax.persistence.*;

@Entity
@SecondaryTable(name="address")
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;


    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "pincode")
    private String pincode;

    public Address(String id, String address, String city, String pincode) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.pincode = pincode;
    }

    public Address() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
