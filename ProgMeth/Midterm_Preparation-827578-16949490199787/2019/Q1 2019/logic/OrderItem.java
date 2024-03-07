package logic;

import logic.*;

public class OrderItem {
    private Item item;
    private int itemAmount;

    public OrderItem(Item item, int itemAmount) {
        setItem(item);
        setItemAmount(itemAmount);
    }

    public void increaseItemAmount(int amount) {
        setItemAmount(getItemAmount() + Math.max(amount, 0));
    }

    public int calculateTotalPrice(){
        int totalPrice = getItem().getPricePerPiece() * getItemAmount();
        return totalPrice;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = Math.max(itemAmount, 0);
    }
}
