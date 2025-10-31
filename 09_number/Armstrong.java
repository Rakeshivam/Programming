import java.util.Scanner;

class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter n: ");
		int n = sc.nextInt();
		if (isArmstrong(n))
			System.out.println(n + " is a Armstrong Number ");
		else
			System.out.println(n + " is NOT a Armstrong Number ");
	}

	public static boolean isArmstrong(int n) {
		int count = getCount(n);
		int sum = 0;
		int originalNum = n;
		while (n > 0) {
			sum = sum + getPower(n % 10, count);
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