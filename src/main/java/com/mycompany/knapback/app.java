/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.knapback;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daleb
 */
public class app {
    public static void main(String[] args) {
        long timepo = System.currentTimeMillis();
        System.out.println(timepo);
        Item item1 = new Item(100,100);
        Item item2 = new Item(210,210);
        Item item3 = new Item(260,260);
        Item item4 = new Item(80,80);
        Item item5 = new Item(90,90);
        
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        
        Knapsack knapSack = new Knapsack();
        
        System.out.println(knapSack.maximumValue(500, items));
        long tiempofinal = System.currentTimeMillis();
        System.out.println(tiempofinal);
        System.out.println(tiempofinal-timepo);
        
    }
}
