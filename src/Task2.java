
public class Task2 {
	public static void main(String[] args) {//NullPointerException//
		String a="Siva";
		System.out.println(a);
		String b=null;
		System.out.println(b);
		char c=a.charAt(0);
		System.out.println(c);
		try {
			char d=b.charAt(0);
			System.out.println(d);
			System.out.println("Thank You");
			
		}
		catch(NullPointerException ne) {
			System.out.println(ne);
		}
		finally {
			System.out.println("finished");
		}
	}

}
