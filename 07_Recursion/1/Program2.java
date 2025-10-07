class Program2 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		test(1);
		System.out.println("Main Ends");
	}

	public static void test(int n) {
		if (n <= 3) {
			System.out.println("This is test method");
			test(n + 1);
		}
	}
}
