package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double tax = 0.2;
        double total;
        int measurement = 3;
        System.out.println("Hello world!");
        Customer c1 = new Customer();
        c1.name = "Pinky";
        c1.size = "S";

        switch (measurement) {
            case 1, 2, 3:
                c1.size = "S";
                break;
            case 4, 5 ,6:
                c1.size = "M";
                break;
            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "XL";
                break;
        }

        System.out.println("Customer is " + c1.name + " and the size is: " + c1.size );


        Clothing item1 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        Clothing item2 = new Clothing();
        item2.description = "Orange Tshirt";
        item2.price = 10.5;
        item2.size = "S";
        System.out.println("Item 1" + "," + item1.description + "," + item1.price + "," + item1.size);
        System.out.println("Item 2" + "," + item2.description + "," + item2.price + "," + item2.size);
        total = ( item1.price + item2.price * 2) * (1 + tax);
        System.out.println("Total equal " + total);

        Clothing[] items = {item1, item2};
        for (Clothing item : items) {
            System.out.println("For loop the array " + item.size + " " + item.description + " " + item.price);
        }

    }
}