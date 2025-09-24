import java.util.Scanner;

class Biggest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int digit = getBiggest(n);
		System.out.println("Biggest digit of " + n + " is: " + digit);

		sc.close();
	}

	public static int getBiggest(int n) {
		int big = n % 10;

		while (n > 0) {
			int rem = n % 10;
			if (rem > big)
				big = rem;
			n /= 10;
		}
		return big;
	}
}
