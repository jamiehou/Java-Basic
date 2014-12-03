package com.ioryz.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataIOStreamDemo {

	public static void main(String[] args) {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			DataOutputStream dos = new DataOutputStream(bos);
			double d = Math.random();
			boolean b = true;
			dos.writeDouble(d);
			dos.writeBoolean(b);
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			DataInputStream dis = new DataInputStream(bis);
			double output_d = dis.readDouble();
			boolean output_b = dis.readBoolean();
			System.out.println("Read from DataOutputStream:");
			System.out.println("double=>" + output_d);
			System.out.println("boolean=>" + (output_b ? "true" : "false"));
			dos.close();
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
