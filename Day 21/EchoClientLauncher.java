import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EchoClientLauncher {
	
	public static void main(String[] args) {
		// if there is no security manager, start one
		
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		
		try {
			String name = "Echo";
			Registry registry = LocateRegistry.getRegistry("localhost");
			EchoService echoService = (EchoService) registry.lookup(name);
			
			String receivedEcho = echoService.echo("Hello!");
			String receivedDate = echoService.getDate();
			double receivedMult = echoService.multiply(10, 2.5);
			double receivedAdd = echoService.addition(10, 2.5);
			
			System.out.println("received echo is " + receivedEcho);
			System.out.println("received date is " + receivedDate);
			System.out.println("received multiply is " + receivedMult);
			System.out.println("received addition is " + receivedAdd);
			
			System.out.print("Input file name: ");
			String fileName = System.console().readLine();
			System.out.println(echoService.viewFile(fileName));
			
		} catch (RemoteException ex) {
			ex.printStackTrace();
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}