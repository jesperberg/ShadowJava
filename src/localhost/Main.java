package localhost;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShadowServiceSoapProxy client = new ShadowServiceSoapProxy();
		
		try{
		System.out.println(client.readFile("shadow.txt"));
		}catch (RemoteException re){
			re.printStackTrace();
		}
		}
	}


