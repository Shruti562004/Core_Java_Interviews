  package com.rays.tcp;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*Server ka main kaam hai client ka wait karna, 
 * connection accept karna, client ko message bhejna aur 
 * client ka message receive karn*/
public class TCPServer {

	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(1234);

		System.out.println("serer wait for client.....");

		Socket client = server.accept();
		System.out.println("client connected");

		DataInputStream in = new DataInputStream(client.getInputStream());

		DataOutputStream out = new DataOutputStream(client.getOutputStream());

		out.writeBytes("Hello Client\n");   // client ko bhej raha hai

		String s = in.readLine();

		System.out.println(s);

		client.close();
		server.close();

	}
}/*
getOutputStream() → data bahar bhejna
getInputStream() → data andar lena

*/