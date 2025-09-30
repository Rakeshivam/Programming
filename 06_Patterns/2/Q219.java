
/*

*/
import java.util.Scanner;

class Q219 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		printPattern(n);

		sc.close();
	}

	public static void printPattern(int n) {
		int star = 1;
		int space = n - 1;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++)
				System.out.printf("%3s", " ");
			for (int j = 1; j <= star; j++) {
				System.out.printf("%-6d", num * (num + 1));
				num++;
			}
			star++;
			space--;
			System.out.println();
		}
	}

}