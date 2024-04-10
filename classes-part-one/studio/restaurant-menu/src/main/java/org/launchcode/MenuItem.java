package org.launchcode;

import jdk.jfr.Category;

import java.time.LocalDateTime;
public class MenuItems {
    private String itemName;
    private String itemDescription;
    private double itemPrice;
    private Category category;
    private boolean isNew;
    private LocalDateTime creationDate;

    public MenuItems(String itemName,
                    String itemDescription, double itemPrice, Category category, boolean isNew) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.category = category;
        this.isNew = isNew;
        this.creationDate = LocalDateTime.now();
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
