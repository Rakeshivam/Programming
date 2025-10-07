class Program5 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		test(1);
		System.out.println("Main Ends");
	}

	public static void test(int n) {
		if (n <= 10) {
			System.out.println(n);
			test(n + 1);
			System.out.println(n);
		}
	}
}
