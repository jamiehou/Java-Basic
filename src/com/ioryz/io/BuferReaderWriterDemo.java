package com.ioryz.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuferReaderWriterDemo {
	
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("resources/input.txt"));
			bw = new BufferedWriter(new FileWriter("resources/bw_output.txt"));
			int c;
			while ((c = br.read()) != -1) {
				System.out.print((char)c);
			}
			for (int i = 0; i < 20; i++) {
				String s = String.valueOf(Math.random());
				bw.write(s + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
