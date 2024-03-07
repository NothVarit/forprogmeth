package logic;

import java.util.ArrayList;
import logic.OrderItem;
import logic.Item;

public class Order {
	private ArrayList<OrderItem> orderItemList;
	private static int totalOrderCount = 0;
	private int orderNumber;
	
	public Order() {
		orderItemList = new ArrayList<OrderItem>();
		totalOrderCount = orderNumber;
		totalOrderCount++;
	}

	public OrderItem addItem(Item item, int amount) {

		for (OrderItem i : getOrderItemList()) {
			if (i.getItem().equals(item)) {
				if (amount > 0) {
					i.setItemAmount(i.getItemAmount() + amount);}
					return i;
			}
		}
		// else create new orderItem with given item and amount, then return the new orderItem
		OrderItem orderItem = new OrderItem(item, amount);
		orderItemList.add(orderItem);
		return orderItem;
	}

	public int calculateOrderTotalPrice() {
		// TODO
		// Calculate total price of the order by summing total price of each orderItem in orderItemList
		int totalPrice = 0;
		for (OrderItem orderItem : getOrderItemList()) {
			totalPrice += orderItem.calculateTotalPrice();
		}
		return totalPrice;
	}

	public static int getTotalOrderCount() {
		return totalOrderCount;
	}
	
	public static void resetTotalOrderCount() {
		totalOrderCount = 0;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public ArrayList<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public static void setTotalOrderCount(int totalOrderCount) {
		Order.totalOrderCount = totalOrderCount;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
}
