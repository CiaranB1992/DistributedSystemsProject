package ie.gmit.sw;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Worker{

	public static void main(String[] args) {
		
	try {
		VigenereBreaker breaker = (VigenereBreaker)Naming.lookup("//localhost/VB");
	} catch (MalformedURLException | RemoteException | NotBoundException e) {
		e.printStackTrace();
	}
		
	URL url;
	HttpURLConnection connection = null;
	try {
		url = new URL("127.0.0.0.1:8080/cracker");
		connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
	} catch (MalformedURLException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	}
}
