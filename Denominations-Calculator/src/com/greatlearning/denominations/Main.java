package com.greatlearning.denominations;

public class Main {

	public static void main(String[] args) {

		DenominationsCalculator calculator = new DenominationsCalculator();

		calculator.collectDenominations();
		calculator.collectPaymentAmount();

		calculator.paymentAmount = 160;

		calculator.calculate();
	}
}