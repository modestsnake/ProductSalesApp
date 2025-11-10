/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// File: src/main/java/com/mycompany/iproduct/ProductSalesReport.java
package com.mycompany.iproduct;

/**
 * Console application for Question 1.1
 * 
 * Displays:
 * - Total sales
 * - Average sales (rounded down)
 * - Maximum sales
 * - Minimum sales
 * 
 * Output matches specification exactly.
 * 
 * @author [Your Name]
 * @version 1.0
 * @since 2025-11-10
 */
public class ProductSalesReport {

    /**
     * Main method - entry point for Q1.1
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        ProductSales ps = new ProductSales();
        int[][] data = ps.GetProductSales();

        // Print report header
        System.out.println("PRODUCT SALES REPORT – 2025");
        
        // Display calculated values with proper formatting
        System.out.printf("Total sales:             %d%n", ps.GetTotalSales());
        System.out.printf("Average sales:      %.0f%n", ps.getAverageSales());
        System.out.printf("Maximum sales:  %d%n", ps.MaxSales(data));
        System.out.printf("Minimum sale:     %d%n", ps.MinSale(data));
        
        // Print separator line
        System.out.println("-----------------------------------------------");
    }
}