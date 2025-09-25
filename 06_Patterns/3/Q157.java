
/*

*/
import java.util.Scanner;

class Q157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
		int n = sc.nextInt();
		printPattern(n);

		sc.close();
	}

	public static void printPattern(int n) {
		if (n % 2 == 0) {
			System.out.println("Pattern is NOT Possible for Even Row!");
			return;
		}
		int star = 1;
		int space = n / 2;
		int rowMid = n / 2 + 1;
		int num = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++)
				System.out.print("   ");
			for (int j = 1; j <= star; j++)
				System.out.printf("%-3d", num);
			if (i < rowMid) {
				star += 2;
				space--;
				num--;
			} else {
				star -= 2;
				space++;
				num++;
			}
			System.out.println();
		}
	}

}