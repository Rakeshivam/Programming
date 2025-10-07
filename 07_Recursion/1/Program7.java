class Program7 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		test(1);
		System.out.println("Main Ends");
	}

	public static void test(int n) {
		if (n <= 2) {
			System.out.println(n);
			test(n + 1);
			System.out.println(n);
		} else {
			System.out.println("Else block: " + n);
		}
		System.out.println("Outside stmt: " + n);
	}
}
