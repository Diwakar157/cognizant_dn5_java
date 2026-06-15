package com.cognizant.search;

import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

	public static Product linearSearch(Product[] products, int targetId) {

        for (Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (products[middle].getProductId() == targetId) {
                return products[middle];
            }

            if (products[middle].getProductId() < targetId) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return null;
    }

	public static void main(String[] args) {
		 Product[] products = {
		            new Product(105, "Laptop", "Electronics"),
		            new Product(101, "Headphones", "Electronics"),
		            new Product(108, "Shoes", "Fashion"),
		            new Product(103, "Watch", "Accessories"),
		            new Product(110, "Backpack", "Travel")
		        };

		        int searchId = 103;

		        System.out.println("Linear Search");

		        Product foundProduct = linearSearch(products, searchId);

		        if (foundProduct != null) {
		            System.out.println("Product Found:");
		            System.out.println(foundProduct);
		        } else {
		            System.out.println("Product not found.");
		        }

		        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

		        System.out.println("\nBinary Search");

		        foundProduct = binarySearch(products, searchId);

		        if (foundProduct != null) {
		            System.out.println("Product Found:");
		            System.out.println(foundProduct);
		        } else {
		            System.out.println("Product not found.");
		        }

	}

}
