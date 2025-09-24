
/*

Enter the Rows:
9
*               *
* *           * *
* * *       * * *
* * * *   * * * *
* * * * * * * * *
* * * *   * * * *
* * *       * * *
* *           * *
*               *


*/
import java.util.Scanner;

class Butterfly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
		int n = sc.nextInt();
		printpattern(n);

		sc.close();
	}

	public static void printpattern(int n) {
		int sStar = 1;
		int eStar = n;
		int mid = n / 2 + 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= sStar || j >= eStar)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			if (i < mid) {
				sStar++;
				eStar--;
			} else {
				sStar--;
				eStar++;
			}
			System.out.println();
		}
	}
}
