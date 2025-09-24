import java.util.Scanner;

class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		if (isPerfect(n))
			System.out.println(n + " is a Perfect Number");
		else
			System.out.println(n + " is NOT a Perfect Number");

		sc.close();
	}

	public static boolean isPerfect(int n) {
		if (n < 6)
			return false;
		int sum = 0;
		int i = 1;
		while (i <= n / 2) {
			if (n % i == 0)
				sum = sum + i;
			i++;
		}
		return n == sum;
	}
}
