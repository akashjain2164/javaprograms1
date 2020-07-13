package testprogram;

public class test2 {

	public static void main(String[] args) {

		int i, j;
		int number = 5;
		for (i = 1; i <= number; i++) {

			for (j = number; j >= i; j--) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

}
