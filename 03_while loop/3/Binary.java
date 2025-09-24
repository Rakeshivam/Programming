import java.util.Scanner;

class Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		String binary = getBinary(n);
		System.out.println(n + " in Binary is: " + binary);

		sc.close();
	}

	public static String getBinary(int n) {
		String bin = "";
		while (n > 0) {
			bin = n % 2 + bin;
			n /= 2;
		}
		return bin;
	}
}
