/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorymanagementsystem;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */

public class Inventory {
    
    private ArrayList<Item> itemList = new ArrayList<>();

   
    public void addItem(Item newItem) {
        itemList.add(newItem);
        System.out.println("Item added successfully!");
    }

    
    public void displayInventory() {
        if (itemList.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Item item : itemList) {
                item.displayItemInfo();
                System.out.println("--------------------");
            }
        }
    }

    
    public Item searchByID(int targetId) {
        for (Item item : itemList) {
            if (item.getID() == targetId) {
                return item; 
            }
        }
        System.out.println("Item with ID " + targetId + " not found.");
        return null; 
    }
}
     
