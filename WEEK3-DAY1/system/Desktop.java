package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Its a 19 inch desktop system");
	}

	public static void main(String[] args) {

		Desktop dp = new Desktop();
		dp.desktopSize();
		dp.computerModel();
	}

}
