import java.util.Scanner;

class DissariumInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Range: ");
		int range = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= range; i++) {
			if (isDissarium(i)) {
				System.out.print(i + "  ");
				count++;
			}
		}
		System.out.println("\nTotal Such numbers are: " + count);
	}

	public static boolean isDissarium(int n) {
		int count = getCount(n);
		int sum = 0;
		int originalNum = n;
		while (n > 0) {
			sum = sum + getPower(n % 10, count--);
			n /= 10;
		}
		return sum == originalNum;
	}

	public static int getCount(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	public static int getPower(int a, int b) {
		int pow = 1;
		for (int i = 1; i <= b; i++)
			pow = pow * a;
		return pow;
	}

}