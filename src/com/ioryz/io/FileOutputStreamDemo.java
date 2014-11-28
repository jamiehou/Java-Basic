package com.ioryz.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream is;
		FileOutputStream os;
		try {
			is = new FileInputStream("resources/input.txt");
			os = new FileOutputStream("resources/output.txt");
			int b;
			int num = 0;
			while ((b = is.read()) != -1) {
				os.write(b);
				num++;
			}
			is.close();
			os.close();
			System.out.println(num + " characters have been written.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
