package com.yingcankeji.architect.command;

public class CommandPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Stock abcStock = new Stock("ABC", 100);
		
		BuyStock buyStockOrder = new BuyStock(new Stock("ABC", 100));
		SellStock sellStockOrde = new SellStock(new Stock("BCD", 50));
		
		BuyStock buyStockOrder2 = new BuyStock(new Stock("EFG", 101));
		SellStock sellStockOrde2 = new SellStock(new Stock("HIJ", 90));
		
		Broker broker = new Broker();
		
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrde);
		broker.takeOrder(buyStockOrder2);
		broker.takeOrder(sellStockOrde2);
		broker.placeOrders();

	}

}
