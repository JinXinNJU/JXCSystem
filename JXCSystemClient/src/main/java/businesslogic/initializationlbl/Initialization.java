package businesslogic.initializationlbl;

import java.rmi.RemoteException;

import po.AccountPO;
import po.CommodityPO;
import po.CustomerPO;
import businesslogicservice.initializationblservice.InitializationblService;
import data.initializationdata.InitializationDataService_Stub;
import dataservice.initializationdataservice.InitializationDataService;

public class Initialization {
	public AccountInfo accountInfo;
	public CommodityInfo commodityInfo;
	public SalesInfo salesInfo;
	public InitializationDataService initialization=new InitializationDataService_Stub(new CommodityPO(true, "time", "operation", 10, 10, 10, 10, 10, 10), new CustomerPO(10, "time", 10, "operation", "type", "style", "mail", 10, 10, "zip", "plugin"), new AccountPO("zip", 10));
	
	
	public String newSystem() {
		// TODO Auto-generated method stub
		return "�ɹ�";
	}

	public String addCommodity(String name, String type, int in_price,
			int out_price) {
		// TODO Auto-generated method stub
		return commodityInfo.addCommodity(name, type, in_price, out_price);
	}

	public String addCustomer(String name, String phone, int level, int money) {
		// TODO Auto-generated method stub
		return salesInfo.addCustomer(name, level, phone, money);
	}

	public String addAccount(String name, int money) {
		
		return accountInfo.addAccount(name,money);
	}

	public String showInformation() {
		// TODO Auto-generated method stub
		initialization=new InitializationDataService_Stub(new CommodityPO(true, "time", "operation", 10, 10, 10, 10, 10, 10), new CustomerPO(10, "time", 10, "operation", "type", "style", "mail", 10, 10, "zip", "plugin"), new AccountPO("zip", 10));
		try {
			if(initialization.getInfomation()!=null){
				return "�ɹ�";
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ʧ��";
	}



}