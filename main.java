/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matteresses_st10479656;

import java.util.ArrayList;
import java.util.List;
public class Main {
    
public static void main(String[] args) {
List<MattressSale> sales = new ArrayList<>();
// Adding sample mattress sales records
sales.add(new MattressSale("Thabo Mokoena"
,
"Cloud Nine King Size Mattress"
,
5500.00));
sales.add(new MattressSale("Sarah Van Der Merwe"
,
"Sealy Posturepedic Queen"
,
4200.00));
MattressReport report = new MattressReport(sales);
report.printReport();
}
}

