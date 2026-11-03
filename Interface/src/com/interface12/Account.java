package com.interface12;

public class Account implements Cloneable {

    String name;
    String address;
    String accNo;

    public Account(String name, String address, String accNo) {
        this.name = name;
        this.address = address;
        this.accNo = accNo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getAccNo() {
//        return accNo;
//    } 
//
//    public void setAccNo(String accNo) {
//        this.accNo = accNo;
//    }
}