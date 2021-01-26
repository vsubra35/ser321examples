import java.net.*;
import java.io.*;

public class TCPServer {
	public static void main (String args[]) {
		ServerSocket listenSocket = null;
        if (args.length != 2) {
          System.out.println("Wrong number of arguments:\ngradle runServer --args=\"8888 9\"");
          System.exit(0);
        }
        int portNo = 9099; // default port
        int delay = 9; // default port
        try {
            portNo = Integer.parseInt(args[0]);
            delay = Integer.parseInt(args[1]);
        } catch (NumberFormatException nfe) {
            System.out.println("port must be integer");
            System.exit(2);
        }
		try {
			listenSocket = new ServerSocket(portNo);
			while(true) {
				Socket clientSocket = listenSocket.accept();
				new Connection(clientSocket, delay);
			}
		} catch(IOException e) {
			System.out.println("Listen socket:"+e.getMessage());
		} finally {
			if (listenSocket != null && listenSocket.isClosed()) {
				try {
					listenSocket.close();
				} catch (Throwable t) {
					System.out.println("Problem closing ServerSocket " + t.getMessage());
				}
			}
		}
	}
}

class Connection extends Thread {
	DataInputStream in;
	DataOutputStream out;
	Socket clientSocket;
	long __msDelay;

	public Connection (Socket aClientSocket, long msDelay) {
		try {
			clientSocket = aClientSocket;
			in = new DataInputStream( clientSocket.getInputStream());
			out =new DataOutputStream( clientSocket.getOutputStream());
			__msDelay = msDelay;
			this.start();
		} catch(IOException e) {
			System.out.println("Connection:"+e.getMessage());
		}
	}
	public void run(){
		try {			                 // an echo server
			String data = in.readUTF();	 // read a line of data from the stream
			System.out.println("Read " + data);
			Thread.sleep(__msDelay);
			out.writeUTF(data);
		} catch (EOFException e) {
			System.out.println("EOF:"+e.getMessage());
		} catch(IOException e) {
			System.out.println("readline:"+e.getMessage());
		} catch (Throwable t) {
			System.out.println("Caught some other ugliness " + t.getMessage());
		}
		finally { 
			try {
				clientSocket.close();
			} catch (IOException e) {
				/*close failed*/
			}
		}	
	}
}
