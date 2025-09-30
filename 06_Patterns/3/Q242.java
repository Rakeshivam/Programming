
/*

*/
import java.util.Scanner;

class Q242 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
		int n = sc.nextInt();
		printPattern(n);
		sc.close();
	}

	public static void printPattern(int n) {
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % 2 == 1)
					System.out.printf("%-4d", num++);
				else
					System.out.printf("%-4d", num--);
			}
			if (i % 2 == 1)
				num = num + n - 1;
			else
				num = num + n + 1;
			System.out.println();
		}
	}

}