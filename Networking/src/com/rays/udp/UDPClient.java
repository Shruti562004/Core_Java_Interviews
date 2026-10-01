package com.rays.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) throws Exception{
		
		DatagramSocket socket = new DatagramSocket();
		
		byte[] bt = "Hello from UDP client".getBytes();
		
		InetAddress address = InetAddress.getByName("127.0.0.1");
		
		DatagramPacket packet = new DatagramPacket(bt, bt.length, address, 4445);
		
		socket.send(packet);
		
		bt = new byte[256];
		
		packet = new DatagramPacket(bt, bt.length);
		
		socket.receive(packet);
		
		String receive = new String(packet.getData(), 0, packet.getLength());
		
		System.out.println("Receive: "+ receive);
	}
}

//Receive: Hello from UDP server