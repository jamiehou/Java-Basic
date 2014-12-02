package com.ioryz.socket;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(SocketConstants.HOST_IP, SocketConstants.HOST_PORT);
			System.out.println("Open socket at " + SocketConstants.HOST_IP + " on port " + SocketConstants.HOST_PORT + " ...");
			InputStream is = new FileInputStream("resources/input.txt");
			OutputStream os = socket.getOutputStream();
			byte buffer[] = new byte[4*1024];
			int temp = 0;
			System.out.println("***Start read file and send to server socket...***");
			while ((temp = is.read(buffer)) != -1) {
				os.write(buffer, 0, temp);
			}
			System.out.println("***Send complete***");
			os.flush();
			is.close();
			os.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
