package org.launchcode;

import java.time.LocalDateTime;
public class MenuItem {
    private String itemName;
    private String itemDescription;
    private double itemPrice;
    private Category.MealCategory category;

    private LocalDateTime creationDate;

    public MenuItem(String itemName,
                    String itemDescription, double itemPrice, Category.MealCategory category) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.category = category;
        this.creationDate = LocalDateTime.now();
    }
    public boolean isNew() {
        return creationDate.isAfter(LocalDateTime.now().minusDays(30));
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Category.MealCategory getCategory() {
        return category;
    }

    public void setCategory(Category.MealCategory category) {
        this.category = category;
    }





    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
