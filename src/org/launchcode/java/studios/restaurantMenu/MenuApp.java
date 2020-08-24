package org.launchcode.java.studios.restaurantMenu;


import java.util.ArrayList;

public class MenuApp {

    public static void main(String[] args) {

        Menu menu = new Menu();

        MenuItem burger = new MenuItem("Burger", 5.99, "juicy burger", "main course", true);
        MenuItem steak = new MenuItem("Steak", 9.99, "Steak cooked to order", "main course", false);


        menu.addMenuItem(burger);
        menu.addMenuItem(steak);



        menu.printMenu();
    }


}
