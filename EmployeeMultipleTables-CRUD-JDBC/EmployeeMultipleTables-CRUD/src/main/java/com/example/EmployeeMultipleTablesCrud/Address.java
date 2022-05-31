package com.example.EmployeeMultipleTablesCrud;



public class Address {
    private String id;
    private String address;
    private String city;
    private String pincode;
    // Employee object TODO
    Employee employee;

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
