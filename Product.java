/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productapp_st10479656;


import java.util.HashMap;
import java.util.Map;

public class Product implements IProduct {
// Stores product names and their total quantities sold
private Map<String, Integer> productSales;
public Product() {
productSales = new HashMap<>();
productSales.put("Laptop"
, 150);
productSales.put("Smartphone"
, 320);
productSales.put("Headphones"
, 210);
productSales.put("Monitor"
, 95);
// Overloaded constructor to accept custom sales data
public Product(Map<String, Integer> productSales) {
this.productSales = productSales;
}

@Override
public int getTotalProductsSold() {
int total = 0;
for (int sales : productSales.values()) {
total += sales;
}
return total;
}

@Override
public double getAverageProductSold() {
if (productSales.isEmpty()) {
return 0.0;
}
return (double) getTotalProductsSold() / productSales.size();
}

@Override
public String getMostPopularProduct() {
if (productSales.isEmpty()) {
return "No products available"
;
}
String mostPopular = ""
int maxSales = -1; 

for (Map.Entry<String, Integer> entry : productSales.entrySet()) {
if (entry.getValue() > maxSales) {
maxSales = entry.getValue();
mostPopular = entry.getKey();
}
}
return mostPopular + " (Sales:" + maxSales + ")"	
;
}
}


