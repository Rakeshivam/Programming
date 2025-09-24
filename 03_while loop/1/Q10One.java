import java.util.Scanner;

class Q10One {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int count = printAndCountFactors(n);
		System.out.println("\nTotal Factors are: " + count);

		sc.close();
	}

	public static int printAndCountFactors(int n) {
		System.out.print(1 + " ");
		int count = 1;
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				int fact1 = i, fact2 = n / i;
				if (fact1 == fact2) {
					count++;
					System.out.print(fact1 + " ");
				} else {
					count += 2;
					System.out.print(fact1 + " " + fact2 + " ");
				}
			}
			i++;
		}
		return count;
	}
}
