package demo;

public class StringProgram {

	public static void main(String[] args) {
		String s1 = "Babita";
		String s2 = "Babita";
		String s3 = new String("Babita");
		String s4 = new String("Babita");
		
	
		System.out.println((s1=s2));
		System.out.println((s1.equals(s2)));
		System.out.println((s3=s4));
		System.out.println((s3.equals(s4)));
		
		

	}

}
