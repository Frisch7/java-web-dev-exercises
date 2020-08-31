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
    public void printMenuItem(int index){
        MenuItem item  = this.menu.get(index);
        System.out.println("---------------------------------");
        System.out.println("Name: " + item.getName());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Category: " + item.getCategory());
        System.out.println("Price: " + item.getPrice());
        System.out.println("New Item: " + item.isNew());
        System.out.println("---------------------------------");
    }
    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void addMenuItem(MenuItem item) {
        if(!this.menu.contains(item)) {
            this.menu.add(item);
            setLastMenuUpdate(new Date());
        }else {
            System.out.println("Error adding menu item: " + item.getName() + " is already on the menu.");
        }
    }
    public void removeMenuItem(MenuItem item){
        if(this.menu.contains(item)){
            this.menu.remove(item);
            setLastMenuUpdate(new Date());
        }
    }

    public Date getLastMenuUpdate() {
        return lastMenuUpdate;
    }

    private void setLastMenuUpdate(Date lastMenuUpdate) {
        this.lastMenuUpdate = lastMenuUpdate;
    }
}
