package test.udp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	
	public static void main(String [] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		DatagramSocket ds = new DatagramSocket();
		InetAddress ip = InetAddress.getLocalHost();
		byte buf[] = null;
		
		while(true) {
			String inp = sc.nextLine();
			buf = inp.getBytes();
			
			DatagramPacket dpSend = new DatagramPacket(buf, buf.length,ip,1234);
			
			ds.send(dpSend);
			
			if(inp.equals("REQUEST")) {  
				
				
				
				// create request object
				//int id, LocalDate d, LocalTime t, int min, ArrayList<Participants> list
				LocalDate d = LocalDate.now();
				LocalTime t = LocalTime.now();
				Participants p1 = new Participants("Maher Hassanain",1234);
				ArrayList<Participants> p = new ArrayList<Participants>();
				p.add(p1);
				RBMS booking = new RBMS(1,d,t,2,p);
				
				// Serialize to a byte array
//				ByteArrayOutputStream bStream = new ByteArrayOutputStream();
//				ObjectOutput oo = new ObjectOutputStream(bStream); 
//				oo.writeObject(booking);
//				oo.close();
//
//				byte[] serializedMessage = bStream.toByteArray();
//				
//				DatagramPacket dpSend1 = new DatagramPacket(serializedMessage, serializedMessage.length,ip,1234);
				System.out.println("Request sent");
//				ds.send(dpSend1);
			}
			
			if(inp.equals("bye")) {
				break;
			}
		}
	}

}