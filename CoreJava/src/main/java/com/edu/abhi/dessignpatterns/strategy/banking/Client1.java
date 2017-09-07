package com.edu.abhi.dessignpatterns.strategy.banking;

public class Client1 extends Payment {

	Client1(PaymentType paymentType){
		this.paymentType=paymentType;
	}
	@Override
	protected void makePayment() {
		this.paymentType.pay();

	}

}
