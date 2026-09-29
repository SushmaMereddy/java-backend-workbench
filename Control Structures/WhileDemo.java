class WhileDemo {

	public static void main(String[] args) {
	
		int n=1;
		int j=1;
		System.out.println("Switch Demo");
		while(j<=10) {
			System.out.println("2*" +j+ "=" +(j*2));
			j++;
		}
		
		System.out.println("Do-While Demo");
		do{
			System.out.println("3*" +n+ "=" +(n*3));
			n++;
		} while(n<=10);
	}
}