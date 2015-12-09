import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
import java.io.*;

public class EchoServer extends UnicastRemoteObject implements EchoService {
	
	public EchoServer() throws RemoteException {
		// nothing to initialise for this server
		//(must have a constructor that throws RemoteException)
	}
	
	@Override
	public String echo(String s) throws RemoteException {
		// This println is not necessary, but helps verifying whether
		// the server has received the call or not on the remote machine
		System.out.println("Replied to some client saying ’" + s + "’");
		return s;
	}
	
	@Override
	public String getDate() throws RemoteException {
		Date date = new Date();
		System.out.println("Replied to some client requesting date.");
		return date.toString();
	}
	
	@Override
	public double multiply(double a, double b) throws RemoteException {
		System.out.println("Replied to some client requesting multiply(" + a + ", " + b + ").");
		return a*b;
	}
	
	@Override
	public double addition(double a, double b) throws RemoteException {
		System.out.println("Replied to some client requesting addition(" + a + ", " + b + ").");
		return a+b;
	}
	
	@Override
	public String viewFile(String fileName) throws RemoteException {
		System.out.println("Replied to some client requesting viewFile(" + fileName + ").");
		
		File file = new File("./" + fileName);
		String result = "";
		
		try (BufferedReader in = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
				result += "\n";
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File " + fileName + " does not exist.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return result;
	}
}