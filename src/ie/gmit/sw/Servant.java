package ie.gmit.sw;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Servant {
	
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
								
		VigenereBreaker vb = (VigenereBreaker)Naming.lookup("VB");
		
		String res = vb.decrypt("asadsdssa", 4);
		System.out.println(res);
	}
}
