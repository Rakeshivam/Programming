
/*

*/
import java.util.Scanner;

class Q216 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		printPattern(n);

		sc.close();
	}

	public static void printPattern(int n) {
		int star = 1;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.printf("%-5d", num * (num + 1));
				num++;
			}
			star++;
			System.out.println();
		}
	}

}