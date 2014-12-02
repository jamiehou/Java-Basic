package com.ioryz.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPSocketServer {

	public static void main(String[] args) {
		new Thread() {
			
			@Override
			public void run() {
				try {
					DatagramSocket ds = new DatagramSocket(SocketConstants.HOST_PORT);
					System.out.println("***Create udp socket and wait for data...***");
					System.out.println("***Received data:***");
					for (int i = 0; i < 2; i++) {
						DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
						ds.receive(dp);
						String str = new String(dp.getData(), "UTF-8");
						System.out.print(str);
					}
					System.out.println("\n***End***");
				} catch (SocketException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
}
