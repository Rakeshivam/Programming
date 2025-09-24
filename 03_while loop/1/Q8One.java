class Q8One {
	public static void main(String[] args) {
		int n = 100;
		System.out.println("All factors are: ");
		System.out.print(1 + " ");
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				int fact1 = i, fact2 = n / i;
				if (fact1 == fact2)
					System.out.print(fact1 + " ");
				else {
					System.out.print(fact1 + " " + fact2 + " ");
				}
			}
			i++;
		}
	}
}
