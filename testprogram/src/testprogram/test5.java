package testprogram;

public class test5 {

	public static void main(String[] args) {

		int i, j;
		int number = 5;
		for (i = 1; i <= number; i++) 
		{

			for (j = 2; j <= i; j++) 
			{

				System.out.print(" ");
			}
			for (int k = number; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}

//output
/*

*****
 ****
  ***
   **
    *




*/