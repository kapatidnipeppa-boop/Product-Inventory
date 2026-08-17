/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productinventory;

/**
 *
 * @author hailan x6
 */
public class ProductInventory {

    public static void main(String[] args) {
   //Product Information
        String productName = "Clorox Scented Bleach ";
        String productCode = "CSB001";
        String categoryCode = "47131800-DB-S01";
        int stockQuantity = 50;
        double unitPrice = 150.55;
        boolean isAvailable = true;
        
        
        
    /* 
        *DISCOUNT_RATE means the discount applied to the product.
        */
    final double DISCOUNT_RATE = 0.10;
    
    // change the stock quantity and the unit price
    
    stockQuantity += 17;
    unitPrice += 17.12;
    
    //Increment stock by quantiy by 1
    stockQuantity++;
    
    // Show the Information of Clorox
    System.out.println("Product Name:" + productName);
    System.out.println("Product Code:" + productCode);
    }
}
