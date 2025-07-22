package roughSpace;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritter {

//	public static void main(String[] args) { // try without resource syntex.
//		String fileName = "java-course.txt";
//		FileWriter writer = null;
//		try {
//			writer = new FileWriter(fileName);
//			writer.write("This the best java course.");
//			writer.flush();
//			System.out.println("File written successfully.");
//		} catch(IOException exception) {
//			System.out.printf("Exception occorred %s", exception.getMessage());
//		} finally {
//			try {
//				writer.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
	
	public static void main(String[] args) { // try with resource syntex.
		String fileName = "java-course.txt";
		
		try (FileWriter writer = new FileWriter(fileName);) {
			writer.write("This the best java course.");
			writer.flush();
			System.out.println("File written successfully.");
		} catch(IOException exception) {
			System.out.printf("Exception occorred %s", exception.getMessage());
		}
	}
}
