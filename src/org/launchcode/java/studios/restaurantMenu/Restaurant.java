package org.launchcode.java.studios.restaurantMenu;
import java.util.ArrayList;
public class Restaurant {
    public static void main(String[] args) {

        Menu menu = new Menu();

        MenuItem burger = new MenuItem("Burger", 5.99, "juicy burger", "main course", true);
        MenuItem steak = new MenuItem("Steak", 9.99, "Steak cooked to order.", "main course", false);
        MenuItem steakCopy = new MenuItem("Steak", 9.99, "Steak cooked to order.", "main course", false);
        MenuItem salad = new MenuItem("Salad", 4.99, "House Salad", "Main course", false);


        menu.addMenuItem(burger);
        menu.addMenuItem(steak);
        menu.addMenuItem(salad);
        menu.addMenuItem(steakCopy);

        System.out.println();
        System.out.println("Print Menu:");
        menu.printMenu();

        System.out.println();
        System.out.println("Print first menu Item:");
        menu.printMenuItem(0);

        System.out.println();
        System.out.println("Print menu after removing Burger");
        menu.removeMenuItem(burger);
        menu.printMenu();

    }
}
