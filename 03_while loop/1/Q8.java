class Q8 {
	public static void main(String[] args) {
		int n = 36;
		int i = 1;
		while (i * i <= n) {
			if (n % i == 0) {
				int fact1 = i, fact2 = n / i;
				if (fact1 == fact2)
					System.out.println(fact1);
				else {
					System.out.println(fact1);
					System.out.println(fact2);
				}
			}
			i++;
		}
	}
}
