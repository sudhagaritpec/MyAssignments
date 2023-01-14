package challenge.day1;

public class ComputeReturnSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I cant able to get the square root as mentioned in the below line , so I
		// tried to print a simple square root of a given number
        // I need some assistence in the below complete program

		int i = 2;
		int num = 144;
		boolean isSqaure = true;

		while (i<num/2) {
			if (num / i == i) {

				System.out.println("Square root of " +num+ " is " + +i);
				isSqaure = false;
			}
			i++;

		}

		if (isSqaure == true) {
			System.out.println("Square root of " + num
					+ "is not a full number i.e it might be the decimal num also logic is unknown for me");
		}
	}

}
