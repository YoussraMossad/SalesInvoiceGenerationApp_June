
package com.sales.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class InvoicesTBLModel extends AbstractTableModel {
    private ArrayList<Invoice> invoices;
    private String[] columns = {"No.", "Date", "Customer", "Total"};
    
    public InvoicesTBLModel(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }
    
    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoice invoice = invoices.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getNumber();
            case 1: return invoice.getDateInvo();
            case 2: return invoice.getCustomerName();
            case 3: return invoice.calculateInvoiceTotal();
            default : return "";
        }
    }
}
