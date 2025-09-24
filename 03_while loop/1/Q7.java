class Q7 {
	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		while (i <= 1000) {
			if (i % 7 == 0 && i % 10 == 7) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println("Total Such Numbers are: " + count);
	}
}
