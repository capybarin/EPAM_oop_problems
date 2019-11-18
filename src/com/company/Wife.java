package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Wife implements ToBuy{
    @Override
    public ArrayList<String> setItems() {
        return new ArrayList<>(Arrays.asList("Sony", "Samsung", "Potato", "Xlam"));
    }
}
