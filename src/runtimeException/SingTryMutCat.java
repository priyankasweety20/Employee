package runtimeException;

public class SingTryMutCat {//SingleTryMultipleCatch//
	public static void main(String[] args) {
		String[] names= {null,"Priya","Siva","Shanmugam"};
		try {
			System.out.println(names[0].charAt(0));
			System.out.println(names[2].charAt(6));
			System.out.println(names[8]);
		}
		catch (NullPointerException ne) {
			System.out.println("Cannot Manipulate");
			
		}
		catch (StringIndexOutOfBoundsException se) {
			System.out.println(se);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
//		ae.printStackTrace//
		}
		catch(Exception e) {
			System.out.println("Error Occured");
			//System.out.println(e);
		}
	}

}
