package week3.d1.assignment3;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("depposit in bankinfo");
	}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();	
		BankInfo bi = new BankInfo();
		bi.deposit();
		
	}
	

}
