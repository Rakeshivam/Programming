import java.util.Scanner;

class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		int pow = getPower(a, b);
		System.out.println(a + " to power " + b + " is: " + pow);

		sc.close();
	}

	public static int getPower(int a, int b) {
		int pow = 1;
		int i = 1;
		while (i <= b) {
			pow = pow * a;
			i++;
		}
		return pow;
	}
}
