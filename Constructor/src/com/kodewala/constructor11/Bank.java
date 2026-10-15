package com.kodewala.constructor11;

public class Bank extends Details {

    int amount;
    String name;
    String accNo;
    String sender;
    String reciever;
    String successful;

    public Bank(int _amount,
                String _name,
                String _accNo,
                String _sender,
                String _reciever,
                String _successful,
                int _balance) {

        super(_balance);

        this.amount = _amount;
        this.name = _name;
        this.accNo = _accNo;
        this.sender = _sender;
        this.reciever = _reciever;
        this.successful = _successful;
    }
}