
/*Tumhara server:

Port 4445 par ready hota hai.
Client se UDP packet receive karta hai.
Packet ke andar ka message nikalta hai.
Message print karta hai.
Client ko response bhejta hai.
Socket close karta hai.

*/
package com.rays.udp;



	import java.net.DatagramPacket;
	import java.net.DatagramSocket;

	public class UDPServer {

		public static void main(String[] args) throws Exception {

			DatagramSocket socket = new DatagramSocket(4445); //data send and recieve

			byte[] bt = new byte[256];
System.out.println("server");
			DatagramPacket packet = new DatagramPacket(bt, bt.length);

			socket.receive(packet);

			String receive = new String(packet.getData(), 0, packet.getLength()); /*Received packet ke actual bytes ko index 0
			se packet ki actual length tak String me convert karo*/
			
			System.out.println("Recieve:" + receive);

			String response = "Hello from UDP server";

			bt = response.getBytes();//String ko byte array (byte[]) me convert karti hai.

			packet = new DatagramPacket(bt, bt.length, packet.getAddress(), packet.getPort());

			socket.send(packet);

			socket.close();

		}
	}
	
	/*op server
	Recieve:Hello from UDP client*/

