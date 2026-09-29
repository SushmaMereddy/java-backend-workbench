class SwitchDemo1 {

	public static void main(String[] args){
	
		char opt = 'I';
		
		switch(opt) {
			case 'I': System.out.println("INDIA");
						break;
			case 'A': System.out.println("AMERICA");
						break;
			case 'C' : System.out.println("CANADA");
						break;
			case 'N' : System.out.println("NETHERLANDS");
						break;
			default : System.out.println("MARS");
		}
	}

}