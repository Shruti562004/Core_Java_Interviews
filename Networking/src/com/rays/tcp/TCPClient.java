
/*Client ka main kaam hai server se connect hona, server
 *  ko message bhejna aur server ka response receive karna.
 * 
 * 
 * 
 */
package com.rays.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {

		Socket client = new Socket("localhost", 1234); //same conmputer , 1234 port pr wait krega connection ka

		DataInputStream in = new DataInputStream(client.getInputStream());

		DataOutputStream out = new DataOutputStream(client.getOutputStream());

		out.writeBytes("Hello Server\n");  // Server ko bhej raha hai

		String s = in.readLine();

		System.out.println(s);

		client.close();
	}
}
