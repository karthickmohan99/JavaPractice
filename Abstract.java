package com.practicing;

abstract class Bank {
	abstract void getBalance(int balance);
}
class BankA extends  Bank{
	@Override
	public void getBalance(int balance){
		System.out.println("Bank A balance"+" "+"$"+balance);
		
	}
}
class BankB extends  Bank{
	@Override
	public void getBalance(int balance){
		System.out.println("Bank B balance"+" "+"$"+balance);
		
	}
}
class BankC extends  Bank{
	@Override
	public void getBalance(int balance){
		System.out.println("Bank C balance"+" "+"$"+balance);
		
	}
}
public class Abstract extends BankC {

	public static void main(String[] args) {
		BankA a = new BankA();
		a.getBalance(1200);
		BankB b = new BankB();
		b.getBalance(1200);
		BankC c = new BankC();
		c.getBalance(1200);

	}

}
