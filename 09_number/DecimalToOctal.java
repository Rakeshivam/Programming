import java.util.Scanner;

class DecimalToOctal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Decimal Value: ");
		int n = sc.nextInt();
		String oct = convertDecimalToOctal(n);
		System.out.println("Decimal " + n + " in Octal is: " + oct);
	}

	public static String convertDecimalToOctal(int n) {
		String res = "";
		while (n > 0) {
			res = n % 8 + res;
			n /= 8;
		}
		return res;
	}
}