/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// File: src/main/java/com/mycompany/iproduct/IProductSalesQ1.java
package com.mycompany.iproduct;

/**
 * Interface for Question 1.2 - Console Sales Report
 * 
 * Defines methods to calculate:
 * - Total sales
 * - Average sales
 * - Maximum sales
 * - Minimum sales
 * 
 * Used by ProductSales class to generate the 2025 sales report.
 * 
 * @author [Your Name]
 * @version 1.0
 * @since 2025-11-10
 */
public interface IProductSalesQ1 {

    /**
     * Calculates the sum of all product sales across all quarters and years.
     * 
     * @param productSales 2D array where rows = years, columns = quarters
     * @return total sales value (e.g., 2200)
     */
    int TotalSales(int[][] productSales);

    /**
     * Calculates the average sales per quarter.
     * 
     * @param productSales 2D array of sales data
     * @return average as double (rounded down in display)
     */
    double AverageSales(int[][] productSales);

    /**
     * Finds the highest single sale in the dataset.
     * 
     * @param productSales 2D array of sales
     * @return maximum sales value (e.g., 700)
     */
    int MaxSales(int[][] productSales);

    /**
     * Finds the lowest single sale in the dataset.
     * 
     * @param productSales 2D array of sales
     * @return minimum sales value (e.g., 150)
     */
    int MinSale(int[][] productSales);
}