
package org.example.Models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order implements Document {
    private int id;
    private int orderNumber;
    private LocalDateTime orderDate;
    private String buyerName;
    private ArrayList<String> products;

    public Order(int id, int orderNumber, LocalDateTime orderDate, String buyerName, ArrayList<String> products) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.buyerName = buyerName;
        this.products = products;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int  id) {
        this.id = id;
    }

    @Override
    public String displayInfo() {
        String[] productInfo = products.get(0).split(" ");

        return  "[Document Order]:" +
                "id: "+ id +"\n" +
                "number: "+ orderNumber +"\n" +
                "date: "+ orderDate +"\n" +
                "customerName: "+ buyerName +"\n" +
                "Products: "+ productInfo[0] + " " + productInfo[1] + " " + productInfo[2] + " " + " (+" +  (products.size() - 1) +")" + "\n";
    }

    @Override
    public int getNumber() {
        return orderNumber;
    }

    @Override
    public void setNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }
}

