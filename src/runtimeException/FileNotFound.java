package runtimeException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
	public static void main(String[] args)  throws IOException {
		File f=new File("C:\\Users\\elcot\\Documents\\Letter.txt");
	   FileReader g=new FileReader(f);
        int temp=0;//husky value so int tharen//
		while((temp=g.read())!=-1) {
			System.out.print((char)(temp));
		}
	}

}
