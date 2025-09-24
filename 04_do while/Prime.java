import java.util.Scanner;

class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		if (isPrime(n))
			System.out.println(n + " is a Prime Number");
		else
			System.out.println(n + " is NOT a Prime Number");

		sc.close();

	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		else if (n == 2 || n == 3)
			return true;
		else if (n % 2 == 0)
			return false;

		int i = 3;
		while (i * i <= n) {
			if (n % i == 0)
				return false;
			i += 2;
		}
		return true;
	}
}
