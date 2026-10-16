package com.product1;

public class Product {

    String name;
    int price;
    String description;
    int quantity;

    Product(String _name, int _price, String _description, int _quantity) {
        this.name = _name;
        this.price = _price;
        this.description = _description;
        this.quantity = _quantity;
    }

    Product(String _name, String _description) {
        this.name = _name;
        this.description = _description;
    }

    Product(String _name, int _price) {
        this.name = _name;
        this.price = _price;
    }

    Product() {
    }
}