import java.util.Scanner;

class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int fact = getFactorial(n);
		System.out.println(n + "!= " + fact);

		sc.close();
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
