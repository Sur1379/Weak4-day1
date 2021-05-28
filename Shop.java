package com.company.Weak4Day1;

import java.util.Scanner;

public class Shop {
    String name;
    String address;
    int countOfProduct;
    int priceForProduct;
    int shopBalance;

    public Shop() {
    }

    public Shop(String name, String address, int countOfProduct, int priceForProduct, int shopBalance) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;
    }

    void checkOrder(int countInput) {
        Scanner scanner = new Scanner(System.in);
        if (countInput <= countOfProduct) {
            System.out.println("if you want to buy it, Please press 1 , if you don’t want to buy it press any bottom.");
            int x = scanner.nextInt();
            if(x == 1){
                shopBalance += countInput * priceForProduct;
                countOfProduct -= countInput;
                System.out.println("Shop balance - " + shopBalance);
            }
            else{
                System.out.println("Thank you");
            }
        }
        else{
            System.out.println("Now we don’t have so much product,sorry");
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop("Tools", "Yerevan", 5, 2000, 500000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input count for product");
        int countInput = scanner.nextInt();
        shop.checkOrder(countInput);


    }
}
