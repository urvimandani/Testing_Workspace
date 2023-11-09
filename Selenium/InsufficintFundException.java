package com.program;

	public class InsufficintFundException extends Exception{
		double amount;
		public InsufficintFundException(double amount) {
			this.amount=amount;
		}
		public double getAmount() {
			return amount;
		}
}

