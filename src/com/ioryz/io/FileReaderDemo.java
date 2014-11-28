package com.ioryz.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("resources/input.txt");
			int c;
			int num = 0;
			while ((c = fr.read()) != -1) {
				System.out.print((char)c);
				num++;
			}
			fr.close();
			System.out.println("\n" + num + " characters have been read.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
