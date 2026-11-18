/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productapp_st10479656;

/**
 *
 * @author amuke
 */
public class Main {
    public static void main(String[] args) {
        // Initiate the product implementation 
        IProduct productData = new Product();
        
        // Passed to PrintProduct tpo generate the report 
        PrintProduct reportPrinter = new PrinterProduct (productData);
        
        system.out.printlin("== PRODUCT SALES REPORT ===");
        reportPrinter.printerReport();
        
    } 
    
}
