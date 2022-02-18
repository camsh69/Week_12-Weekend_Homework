package shop;

import accessories.GuitarStrings;
import instruments.Guitar;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItemToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item) {
        this.stock.remove(item);
    }
}
