package week1.day1;

public class FibonacciPgm {

	// To print first 11 fibonaaci number
	// 0 1 1 2 3 5 8 13 21 34 55

	// 1 2 3 4 5 6 7 8 9 10 11

	public static void main(String[] args) {

		int firstNum = 0;
		int secondNum = 1;
		int sum;
		System.out.print(firstNum + " " + secondNum);
		for (int i = 2; i <=12; i++) {

			sum = firstNum + secondNum; // 1
			System.out.print(" " + sum);

			firstNum = secondNum; //
			secondNum = sum;

			// System.out.println(sum);

		}

	}

}
