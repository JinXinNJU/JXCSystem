package data.systemlogdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.SystemlogPO;
import dataservice.systemlogdataservice.SystemlogDataService;

public class SystemlogDataService_Stub extends UnicastRemoteObject implements SystemlogDataService{

	public SystemlogDataService_Stub() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public SystemlogPO[] get() {
		return new SystemlogPO[1];
	}

	public boolean add(SystemlogPO po) {
		return true;
	}

	public boolean clear() {
		return true;
	}

}
