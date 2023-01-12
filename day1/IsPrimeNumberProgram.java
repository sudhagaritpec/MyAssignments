package week1.day1;

public class IsPrimeNumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 13;
		boolean isPrime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime == true) {
			System.out.println("Its a prime no..");
		} else {
			System.out.println("Its not a prime no..");
		}
	}
}
