package com.company;

import java.util.ArrayList;

public interface Purchase {
    void getShopItems(ToBuy toBuy);
    void showAll();
    void allItems (ArrayList<Item> allItems);
}
