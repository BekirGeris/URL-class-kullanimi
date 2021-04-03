package Býolum12Soru12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class UrlAdresineGit {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.print("Enter a URL: ");
		String URLString = new Scanner(System.in).next();

		File file = new File("gitAl.txt");
		PrintWriter output = new PrintWriter(file);
		try {
			
			URL url = new URL(URLString);
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				String line = input.nextLine();
				System.out.println(line);
				output.println(line);
				count += line.length();
			}
			System.out.println("Dosyanin boyutu " + count + " karekterdir.");
			
		} catch (MalformedURLException ex) {
			System.out.println("Gecersiz URL");
		} catch (IOException ex) {
			System.out.println("I/O Errors: böyle bir dosya yok");
		}finally {
			output.close();
		}
		
		
	}
}
