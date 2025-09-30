
/*

*/
import java.util.Scanner;

class Q234 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		printPattern(n);
		sc.close();
	}

	public static void printPattern(int n) {
		int mid = n / 2 + 1;
		int lStar = mid;
		int rStar = mid;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= rStar; j++) {
				if (j == lStar || j == rStar)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			if (i < mid) {
				lStar--;
				rStar++;
			} else {
				lStar++;
				rStar--;
			}
			System.out.println();
		}
	}

}