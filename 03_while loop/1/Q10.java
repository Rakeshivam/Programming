class Q10 {
	public static void main(String[] args) {
		int n = 45;
		int count = 1;
		System.out.print(1 + " ");
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				int fact1 = i, fact2 = n / i;
				if (fact1 == fact2) {
					count++;
					System.out.print(fact1 + " ");
				} else {
					count += 2;
					System.out.print(fact1 + " " + fact2 + " ");

				}
			}
			i++;
		}
		System.out.println("\nTotal Factors are: " + count);
	}
}
