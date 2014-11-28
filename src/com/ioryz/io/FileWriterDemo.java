package com.ioryz.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter("resources/fw_output.txt");
			for (int i = 0; i < 50000; i++) {
				fw.write(i);
			}
			fw.close();
			System.out.println("50000 characters have been written.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
