import java.util.Scanner;

class Q11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		printPrime(n);

		sc.close();
	}

	public static void printPrime(int n) {
		if (n < 2) {
			System.out.println(n + " is NOT a prime Number");
			return;
		}
		int count = 0;
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				int fact1 = i, fact2 = n / i;
				if (fact1 == fact2)
					count++;
				else
					count += 2;
			}
			i++;
		}
		if (count == 0)
			System.out.println(n + " is a Prime Number");
		else
			System.out.println(n + " is NOT a Prime Number");
	}
}
