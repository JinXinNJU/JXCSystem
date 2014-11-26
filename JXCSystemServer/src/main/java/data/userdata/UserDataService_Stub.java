package data.userdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.UserPO;
import dataservice.userdataservice.UserDataService;

public class UserDataService_Stub extends UnicastRemoteObject implements UserDataService{
	String n;
	String p;
	int d;
	
	public UserDataService_Stub(String n, String p, int d) throws RemoteException{
		this.n = n;
		this.p = p;
		this.d = d;
	}
	
	public UserDataService_Stub() throws RemoteException {
		
	}
	
	public boolean addUser(UserPO po) {
		return true;
	}

	public boolean delUser(UserPO po) {
		return true;
	}

	public UserPO getUser(String name) {
		return new UserPO(n, p, d);
	}

	public UserPO[] show() {
		return new UserPO[1];
	}

	public boolean clear() {
		return true;
	}

	public boolean delUser(String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
