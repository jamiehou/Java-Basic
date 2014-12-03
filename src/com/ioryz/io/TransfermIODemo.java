package com.ioryz.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransfermIODemo {
	
	private static final String TAG_END = "exit";

	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			FileWriter fw = new FileWriter("resources/sysin_output.txt");
			System.out.println("Please enter message to write into output file. Enter 'exit' to complete input...");
			String str = br.readLine();
			while (str != null) {
				if (TAG_END.equals(str)) 
					break;
				fw.write(str + "\n");
				str = br.readLine();
			}
			fw.flush();
			br.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
