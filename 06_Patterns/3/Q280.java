
/*

*/
import java.util.Scanner;

class Q280 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
		int n = sc.nextInt();
		printPattern(n);
		sc.close();
	}

	public static void printPattern(int n) {

		int sSpace = n / 3 - 1;
		int mid = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			// part-1
			for (int j = 1; j <= n / 3; j++) {
				if (i >= n / 3 && i <= 2 * n / 3 + 2 && j > sSpace)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			// Part-2
			for (int j = n / 3 + 1; j <= n - 2; j++) {
				if (i <= n / 3 || i >= 2 * n / 3 + 2)
					System.out.print("* ");
				else
					System.out.print("  ");

			}

			if (i >= n / 3 && i <= 2 * n / 3 + 2) {
				if (i < mid)
					sSpace--;
				else
					sSpace++;
			}

			System.out.println();
		}

	}

}
