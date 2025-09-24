import java.util.Scanner;

class LCM1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the 1st Number: ");
		int n1 = sc.nextInt();
		System.out.println("ENter the 2nd Number: ");
		int n2 = sc.nextInt();
		System.out.println("ENter the 3rd Number: ");
		int n3 = sc.nextInt();
		int lcm = getLCM(n1, n2, n3);
		System.out.println("LCM is: " + lcm);

		sc.close();

	}

	public static int getLCM(int a, int b, int c) {
		for (int i = 1;; i++) {
			if (i % a == 0 && i % b == 0 && i % c == 0)
				return i;
		}
	}
}
