//uncheckedPackage//
public class Task1 {
	public static void main(String[] args) {//Arthimetic Exception//
		String c="David";
		System.out.println("Welcome"+ c);
		try {
			int a=5;
			int b=4;//suppose 0 kudutha error occured varum//
			int result=a/b;
			System.out.println(result);
			
			System.out.println("Code Excecuted");
			
		}
		catch(ArithmeticException d) {
			System.out.println("Error Occured");
			
		}
	finally {
			System.out.println("Finshed");
		}
		
	}

}
