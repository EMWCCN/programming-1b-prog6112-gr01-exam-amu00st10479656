/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productapp_st10479656;


public class PrintProduct {
    
private IProduct product;
public PrintProduct(IProduct product) {
this.product = product;
}
public void printTotalProductSales() {
System.out.println("----------------------------------------");
System.out.println("Total Products Sold:" + product.getTotalProductsSold());
}
public void printAverageProductSales() {
System.out.println("Average Product Sales:
product.getAverageProductSold());
" +
}
public void printMostPopularProductSale() {
System.out.println("Most Popular Product:
" +
product.getMostPopularProduct());
System.out.println("
----------------------------------------
");
}
// Convenience method to print the full report at once
public void printReport() {
printTotalProductSales();
printAverageProductSales();
printMostPopularProductSale();
}
}

