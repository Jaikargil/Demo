package org.bank;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Deposit : 20000");
	}
   public static void main(String[] args) {
	AxisBank a = new AxisBank();
	a.saving();
	a.fixed();
	a.deposit();
}
}
