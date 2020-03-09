package StrategyPattern;

public class PaypalStrategy {

	private Object emailId;
	private Object password;

	public PaypalStrategy(String string, String string2) {
		Object email = null;
		this.emailId=email;
		Object pwd = null;
		this.password=pwd;
	}

	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
		
	}

}
