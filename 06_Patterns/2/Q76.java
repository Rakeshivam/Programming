
/*

*/
import java.util.Scanner;

class Q76 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
		int n = sc.nextInt();
		printPattern(n);

		sc.close();
	}

	public static void printPattern(int n) {
		int star = 1;
		int space = n - 1;
		for (int i = 1; i <= n; i++) {
			int num = 1;
			for (int j = 1; j <= space; j++)
				System.out.print("  ");
			int starMid = star / 2 + 1;
			for (int j = 1; j <= star; j++) {
				if (j < starMid)
					System.out.print(num++ + " ");
				else
					System.out.print(num-- + " ");
			}
			star += 2;
			space--;
			System.out.println();
		}
	}

}