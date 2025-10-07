class Program1 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		test();
		System.out.println("Main Ends");
	}

	public static void test() {
		System.out.println("This is test method");
		test();
	}
}
