package localhost;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		
		ShadowServiceSoapProxy client = new ShadowServiceSoapProxy();
		
		System.out.println(client.readFile("shadow.txt"));

	}

}
