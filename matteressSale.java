/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matteresses_st10479656;

public class MattressSale {
    
private String customerName;
private String productName;
private double price;
public MattressSale(String customerName, String productName, double price) {
this.customerName = customerName;
this.productName = productName;
this.price = price;
}
public String getCustomerName() {
return customerName;
}
public String getProductName() {
return productName;
}
public double getPrice() {
return price;
}
// VAT is 15%
public double getVatAmount() {
return price * 0.15;
}
// Commission is 5%
public double getCommissionAmount() {
return price * 0.05;
// Total sale amount = price + vat + commission
public double getTotalSaleAmount() {
return price + getVatAmount() + getCommissionAmount();
}
}
}

