
package com.sales.model;

import java.util.ArrayList;

public class Invoice {
    private int number;
    private String dateInvo;
    private String customerName;
    private ArrayList<Line> linesInvo;
    
    public Invoice() {
    }

    public Invoice(int number, String dateInvo, String customerName) {
        this.number = number;
        this.dateInvo = dateInvo;
        this.customerName = customerName;
    }

    public double calculateInvoiceTotal() {
        double total = 0.0;
        for (Line line : getLinesInvo()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public ArrayList<Line> getLinesInvo() {
        if (linesInvo == null) {
            linesInvo = new ArrayList<>();
        }
        return linesInvo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDateInvo() {
        return dateInvo;
    }

    public void setDateInvo(String dateInvo) {
        this.dateInvo = dateInvo;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + number + ", date=" + dateInvo + ", customer=" + customerName + '}';
    }
    
    public String getAsCSV() {
        return number + "," + dateInvo + "," + customerName;
    }
    
}
