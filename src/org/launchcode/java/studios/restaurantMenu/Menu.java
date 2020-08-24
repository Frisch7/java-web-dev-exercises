package org.launchcode.java.studios.restaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
    Date lastMenuUpdate;
    public Menu(){

    }
    public Menu(ArrayList<MenuItem> items) {
        for (MenuItem item: items
             ) {
            addMenuItem(item);
        }
    }
    public void printMenu(){
        System.out.println("MENU as of: " + this.lastMenuUpdate);
        for (MenuItem item: this.menu
             ) {
            System.out.println("---------------------------------");
            System.out.println("Name: " + item.getName());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Category: " + item.getCategory());
            System.out.println("Price: " + item.getPrice());
            System.out.println("New Item: " + item.isNew());
        }
    }
    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void addMenuItem(MenuItem item) {
        this.menu.add(item);
        setLastMenuUpdate(new Date());
    }

    public Date getLastMenuUpdate() {
        return lastMenuUpdate;
    }

    private void setLastMenuUpdate(Date lastMenuUpdate) {
        this.lastMenuUpdate = lastMenuUpdate;
    }
}
