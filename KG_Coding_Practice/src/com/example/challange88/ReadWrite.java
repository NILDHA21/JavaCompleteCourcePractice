package com.example.challange88;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*88. File Not Found Exception Handling
    Write a program to read a filename from the user and display its content. The program should handle the situation where the file does not exist.
Key Points:
* Use Scanner to read the filename from the user.
* Use FileReader to read the file content.
* Implement a try-catch block to handle FileNotFoundException.
* Display a message informing the user if the file is not found.*/

public class ReadWrite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name you wish to read. ");
		String fileName = sc.next();
		
		try(FileReader reader = new FileReader(fileName)){
			int read;
			while((read = reader.read()) != -1) {
				System.out.print((char)read);
			}
		} catch (FileNotFoundException exception) {
			System.out.printf("%s not found", fileName);
		} catch(IOException exception) {
			System.out.printf("Exception occorred %s", exception.getMessage());
		}
		sc.close();
	}
}
