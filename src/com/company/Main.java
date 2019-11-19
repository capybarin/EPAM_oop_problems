package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Husband hus = new Husband();
	    hus.getShopItems(new Wife());
	    Item item1 = new Item("Samsung",25);
        Item item2 = new Item("Sony",30);
        Item item3 = new Item("Potato",40);
        Item item4 = new Item("Bread",60);
        Item item5 = new Item("Apple",17);
        Item item6 = new Item("Milk",10);
        Item item7 = new Item("Acer",7);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
	    hus.allItems(items);
	    hus.showAll();
	    hus.showPurchasableItems();
    }
}
