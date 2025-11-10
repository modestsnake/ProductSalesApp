/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.iproduct;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductSalesTest_Q1 {
    private final ProductSales ps = new ProductSales();
    private final int[][] data = {{300, 150, 700}, {250, 200, 600}};

    @Test
    void CalculateTotalSales_ReturnsTotalSales() {
        assertEquals(2200, ps.TotalSales(data));
    }

    @Test
    void AverageSales_ReturnsAverageProductSales() {
        assertEquals(366.666, ps.AverageSales(data), 0.01);
    }
}