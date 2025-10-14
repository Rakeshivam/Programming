class Program7 {
	public static void main(String[] args) {
		String s1 = new String("mohan");
		String s2 = new String("mohan");
		String s3 = "mohan";
		String s4 = "mohan";
		String s5 = "mohan";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3 == s4);
		System.out.println(s3 == s1);
		System.out.println(s3.equals(s1));
	}
}