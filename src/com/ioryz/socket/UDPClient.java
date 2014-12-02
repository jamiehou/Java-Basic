package com.ioryz.socket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket();
			System.out.println("UDP socket init...");
			FileInputStream fis = new FileInputStream("resources/input.txt");
			byte buffer[] = new byte[1024];
			int temp = 0;
			InetAddress addr = InetAddress.getByName(SocketConstants.HOST_IP);
			System.out.println("Start creating data packet and send with datagram socket...");
			int num = 0;
			while ((temp = fis.read(buffer)) != -1) {
				DatagramPacket pack = new DatagramPacket(buffer, temp, addr, SocketConstants.HOST_PORT);
				ds.send(pack);
				num++;
			}
			System.out.println("***" + num + " Packets sent***");
			fis.close();
		} catch (SocketException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			ds.close();
		}
	}
}
