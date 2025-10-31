import java.util.Scanner;

class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Decimal Value: ");
		int n = sc.nextInt();
		String bin = convertDecimalToBinary(n);
		System.out.println("Decimal " + n + " in Binary is: " + bin);
	}

	public static String convertDecimalToBinary(int n) {
		String res = "";
		while (n > 0) {
			res = n % 2 + res;
			n /= 2;
		}
		return res;
	}
}