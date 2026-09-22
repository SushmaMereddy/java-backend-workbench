class ConditionalOperatorDemo {

	public static void main(String[] args) {
		String res = (5<6) ? "Hi" : "Bye";
		System.out.println(res);
		
		int a = 8;
		String result = (a%2==0) ? "Even number" : "Odd number";
		System.out.println(result);
	}

}