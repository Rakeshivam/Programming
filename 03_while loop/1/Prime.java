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
		if (n < 2) {
			return false;
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
		return count == 0;
	}
}
