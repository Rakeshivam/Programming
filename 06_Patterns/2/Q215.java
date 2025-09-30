
/*

*/
import java.util.Scanner;

class Q215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		printPattern(n);

		sc.close();
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++)
			System.out.print(i * (i + 1) + " ");
	}

}