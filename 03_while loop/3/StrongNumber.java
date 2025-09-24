import java.util.Scanner;

class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		if (isStrong(n))
			System.out.println(n + " is a Strong Number!");
		else
			System.out.println(n + " is NOT a Strong Number!");

		sc.close();
	}

	public static boolean isStrong(int n) {
		int sum = 0;
		int originalNum = n;
		while (n > 0) {
			sum = sum + getFactorial(n % 10);
			n /= 10;
		}
		return originalNum == sum;
	}

	public static int getFactorial(int n) {
		int fact = 1;
		int i = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		return fact;
	}
}
