package com.ioryz.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream is;
		try {
			is = new FileInputStream("resources/input.txt");
			int b;
			int num = 0;
			while ((b = is.read()) != -1) {
				System.out.print((char)b);
				num++;
			}
			is.close();
			System.out.println(num + " characters has been read!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
