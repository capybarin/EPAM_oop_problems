package com.company;
import java.util.ArrayList;

public class Husband implements All_Items, Purchase {
    private ArrayList<String> toBuyItems = new ArrayList<>();
    private ArrayList<Item> allItemsC = new ArrayList<>();

    @Override
    public void allItems(ArrayList<Item> allItems) {
        this.allItemsC.addAll(allItems);
    }

    @Override
    public void getShopItems(ToBuy toBuy) {
        this.toBuyItems.addAll(toBuy.setItems());
    }

    @Override
    public void showAll() {
        System.out.println("Total list:\n");
        allItemsC.forEach((i) -> System.out.println(i));
        System.out.println();
    }

    public ArrayList<Item> createPurchase(){
        ArrayList<Item> purch = new ArrayList<>();
        allItemsC.forEach((i)->{if (toBuyItems.contains(i.getName())) purch.add(i);});
        return purch;
    }

    public void showPurchasableItems(){
        System.out.println("Bought:\n");
        createPurchase().forEach((i) -> System.out.println(i));
        System.out.println("\nTotal price: " + allSum());
    }

    public int allSum(){
        int sumC = 0;
        sumC += createPurchase().stream().mapToInt(Item::getPrice).sum();
        return sumC;
    }
}
