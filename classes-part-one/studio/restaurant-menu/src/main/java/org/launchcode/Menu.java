package org.launchcode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<MenuItem> menuItems = new ArrayList<>();
    private LocalDateTime lastUpdate = LocalDateTime.now();

    public void addItem(MenuItem item) {
        menuItems.add(item);
        lastUpdate = LocalDateTime.now();
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;

    }

    public List<MenuItem> getMenuItems() {
        return new ArrayList<>(menuItems);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
   MenuItem spaghetti = new MenuItem ("Spaghetti", "Italian pasta dish with marinara sauce", 15.99, Category.MealCategory.MAIN_COURSE);
   menu.addItem(spaghetti);

   MenuItem iceCream = new MenuItem("Ice cream", "Vanilla ice cream with chocolate sauce", 4.99, Category.MealCategory.DESSERT);
   menu.addItem(iceCream);
   System.out.println(menu.getLastUpdate());
   System.out.println(menu.getMenuItems());
   for(MenuItem item : menu.getMenuItems())
   {System.out.println(item.getItemName() + ":" + item.isNew());
    }
}}
