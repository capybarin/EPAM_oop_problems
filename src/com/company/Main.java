package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static void main(String[] args) {
        final int ITEMS = 6;
        ArrayList<Item> items = new ArrayList<>();
	    Husband hus = new Husband();
	    hus.getShopItems(new Wife());
	    String[] namesArray = {"Samsung","Sony","Sharp","Apple","Acer",
                            "Bread","Sausage","Butter", "Milk","Potato"};
        for (int i = 0; i < ITEMS; i++) {
            int price = new Random().nextInt(300);
            Item item = new Item(getRandom(namesArray),price);
            items.add(item);
        }
	    hus.allItems(items);
	    hus.showAll();
	    hus.showPurchasableItems();
    }
}
