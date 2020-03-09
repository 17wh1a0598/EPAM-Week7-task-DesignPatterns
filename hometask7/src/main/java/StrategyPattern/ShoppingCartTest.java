package StrategyPattern;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1256",10);
		Item item2 = new Item("4549",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
		cart.pay(new CreditCardStrategy("Sania Khan", "11646131969", "987", "15/16"));
	}

}