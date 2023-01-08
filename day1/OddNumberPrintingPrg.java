package week1.day1;

public class OddNumberPrintingPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("List of ODD number from 1 to 20 is here: ");

//		for (int i = 1; i <= 20; i++) {
//			if ((i % 2) != 0) {
//				System.out.println(i);
//			}
//		}
		int i = 1;
		while (i <= 20) {
			if ((i % 2) != 0)
				System.out.println(i);
		}
		i++;
	}
}
