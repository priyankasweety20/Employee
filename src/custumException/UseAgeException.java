package custumException;

public class UseAgeException {
	public static void main(String[] args) throws AgeException {
		int age=17;//19//
		if(age<18) {
			throw new AgeException ("Not Eligible");
		}
		else {
			System.out.println("Eligible");
		//System.err.println("Eligible");
		}
		
	}

}
