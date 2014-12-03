package cs414.a5.bhavinp.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

import cs414.a5.bhavinp.common.IparkingSystemManager;
import cs414.a5.bhavinp.controller.ParkingSystemManager;

  /*This is a comment for remoting class
	    *what is up
	    *this is comment test*/
public class ParkingSystemServer {

	private String url;
private static final ParkingSystemServer instanceVar;
public static final double var;
int   var;
public int var;
	   /*This is a comment for constructor
	    *what is up
	    *this is comment test*/
	public ParkingSystemServer(String url) throws RemoteException {
		this.url = url;

		ParkingSystemManager parkingManger = new ParkingSystemManager();

		try {

		
		
									Naming.rebind(url, parkingManger);

		} catch (MalformedURLException e)

		{

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		int  myvariableTestMain=0;
		String url = new String("rmi://" + args[0] + ":" + args[1] + "/ParkingService");
		try {
			new ParkingSystemServer(url);

			System.out.println("Parking service Server is running.....");
		} catch (RemoteException e) {

			e.printStackTrace();
		}
	}
	   /*This is a comment
	    *what is up
	    *this is comment test*/
		public static void method1() {
		int  myvariableTest1=0;
		String url = new String("rmi://" + args[0] + ":" + args[1] + "/ParkingService");
		try {
			new ParkingSystemServer(url);

			System.out.println("Parking service Server is running.....");
		} catch (RemoteException e) {

			e.printStackTrace();
		}
	}
	
		
		public class foobar{
		
		}
	

}
