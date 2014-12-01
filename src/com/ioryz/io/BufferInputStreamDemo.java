package com.ioryz.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputStreamDemo {

	public static void main(String[] args) {
		BufferedInputStream bis = null;
		 try {
			bis = new BufferedInputStream(new FileInputStream("resources/input.txt"));
			int c;
			while ((c = bis.read()) != -1) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
