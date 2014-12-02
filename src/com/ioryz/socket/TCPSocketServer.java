package com.ioryz.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSocketServer {

	public static void main(String[] args) {
		
		new Thread() {
			
			@Override
			public void run() {
				ServerSocket ss = null;
				try {
					System.out.println("Start server socket......");
					ss = new ServerSocket(SocketConstants.HOST_PORT);
					Socket s = ss.accept();
					InputStreamReader isr = new InputStreamReader(s.getInputStream(), "UTF-8");
					BufferedReader br = new BufferedReader(isr);
					String str = br.readLine();
					System.out.println("***Server received from client:***");
					while (str != null) {
						System.out.println(str);
						str = br.readLine();
					}
					System.out.println("***End***");
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						ss.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}
