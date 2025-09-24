import java.util.Scanner;

class Octal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		String octal = getOctal(n);
		System.out.println(n + " in Octal is: " + octal);

		sc.close();
	}

	public static String getOctal(int n) {
		String oct = "";
		while (n > 0) {
			oct = n % 8 + oct;
			n /= 8;
		}
		return oct;
	}
}
