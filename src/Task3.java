
public class Task3 {
	public static void main(String[] args) {//NumberForamatException//
		String a="Priya123";
		try {
		int b=Integer.parseInt(a);
		System.out.println(b);
	}
     catch(NumberFormatException nf) {
    	nf.printStackTrace();
    
     //System.out.println(nf);
    	 //System.out.println("message");
     }
	
}
}
