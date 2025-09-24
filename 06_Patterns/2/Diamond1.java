
/*
Enter the Rows:
9
        *
      *   *
    *   *   *
  *   *   *   *
*   *   *   *   *
  *   *   *   *
    *   *   *
      *   *
        *



*/
import java.util.Scanner;

class Diamond1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
		int n = sc.nextInt();
		printpattern(n);

		sc.close();
	}

	public static void printpattern(int n) {
		int star = 1;
		int space = n / 2;
		int mid = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++)
				System.out.print("  ");

			for (int j = 1; j <= star; j++) {
				System.out.print("*   ");
			}
			if (i < mid) {
				star++;
				space--;
			} else {
				star--;
				space++;
			}
			System.out.println();
		}
	}
}
