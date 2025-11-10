/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// File: src/main/java/com/mycompany/iproduct/IProductSalesQ2.java
package com.mycompany.iproduct;

/**
 * Interface for Question 2.4 - GUI Application
 * 
 * Defines methods to support the Swing GUI:
 * - Load raw data
 * - Get totals, averages
 * - Count sales over/under limit
 * - Report number of years processed
 * 
 * @author [Your Name]
 * @version 1.0
 * @since 2025-11-10
 */
public interface IProductSalesQ2 {

    /**
     * Returns a defensive copy of the sales data.
     * 
     * @return 2D array: [years][products]
     */
    int[][] GetProductSales();

    /**
     * Returns total sales for all years.
     * 
     * @return total sales (2200)
     */
    int GetTotalSales();

    /**
     * Counts how many sales exceed the success limit (500).
     * 
     * @return number of sales > 500
     */
    int GetSalesOverLimit();

    /**
     * Counts how many sales are at or below the limit.
     * 
     * @return number of sales <= 500
     */
    int GetSalesUnderLimit();

    /**
     * Returns number of years of data processed.
     * 
     * @return number of years (2)
     */
    int GetProductsProcessed();

    /**
     * Returns average sales per quarter.
     * 
     * @return average as double
     */
    double getAverageSales();
}