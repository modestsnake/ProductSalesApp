/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// File: src/main/java/com/mycompany/iproduct/ProductSales.java
package com.mycompany.iproduct;

/**
 * Core business logic class implementing both Q1 and Q2 interfaces.
 * 
 * Features:
 * - Hard-coded sales data for 2 years
 * - Efficient, reusable calculation methods
 * - Defensive copying of data
 * - Full Javadoc and inline comments
 * 
 * @author [Your Name]
 * @version 1.0
 * @since 2025-11-10
 */
public class ProductSales implements IProductSalesQ1, IProductSalesQ2 {

    /**
     * Sales data: 2 years × 3 products
     * 
     * Year 1: Microphone=300, Speakers=150, Mixing Desk=700
     * Year 2: Microphone=250, Speakers=200, Mixing Desk=600
     */
    private static final int[][] DATA = {
            {300, 150, 700}, // Year 1
            {250, 200, 600}  // Year 2
    };

    /** Success threshold for product performance */
    private static final int LIMIT = 500;

    // ===================================================================
    // Q1.2: Console Report Calculations
    // ===================================================================

    /**
     * {@inheritDoc}
     */
    @Override
    public int TotalSales(int[][] a) {
        int sum = 0;
        for (int[] year : a) {
            for (int sale : year) {
                sum += sale;
            }
        }
        return sum;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double AverageSales(int[][] a) {
        int total = TotalSales(a);
        int count = a.length * a[0].length;
        return count == 0 ? 0.0 : (double) total / count;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int MaxSales(int[][] a) {
        int max = Integer.MIN_VALUE;
        for (int[] year : a) {
            for (int sale : year) {
                if (sale > max) max = sale;
            }
        }
        return max;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int MinSale(int[][] a) {
        int min = Integer.MAX_VALUE;
        for (int[] year : a) {
            for (int sale : year) {
                if (sale < min) min = sale;
            }
        }
        return min;
    }

    // ===================================================================
    // Q2.4: GUI Support Methods
    // ===================================================================

    /**
     * {@inheritDoc}
     */
    @Override
    public int[][] GetProductSales() {
        int[][] copy = new int[DATA.length][];
        for (int i = 0; i < DATA.length; i++) {
            copy[i] = DATA[i].clone(); // Deep copy
        }
        return copy;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int GetTotalSales() {
        return TotalSales(DATA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getAverageSales() {
        return AverageSales(DATA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int GetSalesOverLimit() {
        int count = 0;
        for (int[] year : DATA) {
            for (int sale : year) {
                if (sale > LIMIT) count++;
            }
        }
        return count;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int GetSalesUnderLimit() {
        int count = 0;
        for (int[] year : DATA) {
            for (int sale : year) {
                if (sale <= LIMIT) count++;
            }
        }
        return count;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int GetProductsProcessed() {
        return DATA.length;
    }
}