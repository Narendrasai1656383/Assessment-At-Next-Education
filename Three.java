package Assessment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Three {

	public static void main(String[] args) throws IOException {
//		try { //used to create files 
//		File f=new File("Source .txt");
//		f.createNewFile();
//		FileWriter fw=new FileWriter(f);
//		fw.write("Write a program to copy content from one file to another file");
//		File ff=new File("Destination.txt");
//		ff.createNewFile();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		try(FileInputStream fis=new FileInputStream("Source.txt"); FileOutputStream fos=new FileOutputStream("Destination.txt")){
			int b;
			while((b=fis.read())!=-1) {
				fos.write((char)b);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
