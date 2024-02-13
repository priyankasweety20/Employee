
public class Task4 {
	public static void main(String[] args) {//StringIndexOutOfBoundException//
		String name="janarthana";
		System.out.println(name.charAt(5));
		
	
	try {
		System.out.println(name.charAt(15));
		
	}
	catch (StringIndexOutOfBoundsException se) {
		System.out.println(se);
	}

	}
}
