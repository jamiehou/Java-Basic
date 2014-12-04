package com.ioryz.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectIODemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("resources/object_io_output.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			T t = new T();
			oos.writeObject(t);
			FileInputStream fis = new FileInputStream("resources/object_io_output.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			t = (T) ois.readObject();
			System.out.println("Read object=> a=" + t.a + " b=" + (t.b ? "true" : "false") + " s=" + t.s);
			oos.close();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class T implements Serializable {
	
	public int a;
	public boolean b;
	public String s;
	
	private static final long serialVersionUID = 1L;
	
	public T() {
		a = 10;
		b = true;
		s = "test";
	}
}