package rmiClient;
import java.rmi.Naming;

import rmiService.IConversion;
public class conversionClient {

	public static void main(String[] args) {
		try {
			IConversion stub=(IConversion)Naming.lookup("rmi://localhost:1099/ObjectDistant");
			
			System.out.println(stub.convertirMontant(1500));
			System.out.println(stub.convertirMontant(1000));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
