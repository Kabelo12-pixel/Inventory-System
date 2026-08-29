/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorymanagementsystem;

/**
 *
 * @author LENOVO
 */
public class Item {

    private String name;
    private int quantity;
    private int ID;
    private double price;

    public Item(String name, int quantity, int ID, double price) {
        this.name = name;
        this.quantity = quantity;
        this.ID = ID;
        this.price = price;

    }

    public Item() {
    }

    public double getprice() {
        return price;
    }

    public int getID() {
        return ID;
    }

    public int getquantity() {
        return quantity;
    }

    public String getname() {
        return name;
    }

    public void displayItemInfo() {
        System.out.println("--- Item Details ---");
        System.out.println("Item Name: " + name);
        System.out.println("Item Quantity: " + quantity);
        System.out.println("Item ID: " + ID);
        System.out.println("Item price: " + price);

    }
}
