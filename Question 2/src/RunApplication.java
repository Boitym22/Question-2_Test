/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String beverageType = "";
            
            System.out.println("Select the beverage type");
            System.out.println("1) COFFEE");
            System.out.println("2) TEA");
            System.out.println("3) BOBA");
            
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            
            switch (choice) {
                case 1 -> beverageType = "COFFEE";
                case 2 -> beverageType = "TEA";
                case 3 -> beverageType = "BOBA";
                default -> {
                    System.out.println("Invalid beverage choice.");
                    input.close();
                    return;
                }
            }
            
            System.out.print("Enter the city: ");
            String city = input.nextLine().toUpperCase();
            
            System.out.print("Enter the total sales of "
                    + beverageType + " beverages in "
                    + city + ": ");
            
            int totalSales = input.nextInt();
            
            BeverageSales sales = new BeverageSales(
                    beverageType, city, totalSales);
            
            sales.printReport();
        }
    }
}


