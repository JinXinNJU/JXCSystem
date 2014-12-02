package ui.account;

import ui.FatherPanel;
import ui.setting.MyFrame;

public class IniComPanel extends FatherPanel{
	AccountAllUIController uiController;
	public IniComPanel(MyFrame frame,String url,
			AccountAllUIController uiController){
		super(frame,url,uiController);
		this.uiController = uiController;
		this.repaint();
		
		uiController.setBack_first(this);
		
		
	}
}
