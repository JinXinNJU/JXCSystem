package ui.commodity;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;

import javax.swing.JFrame;

import ui.FatherPanel;
import ui.UIController;
import ui.setting.ColorFactory;
import ui.setting.FontFactory;
import ui.setting.ForwardButton;
import ui.setting.MyButton;
import ui.setting.MyFrame;
import ui.setting.MyLabel;
import ui.setting.resultPanels.ResultPanelController;
import vo.SortVO;

public class ConfirmSortPanel extends FatherPanel implements ActionListener{
	private MyFrame frame;
	private CommodityAllUIController commodityAllUIController;
	private ResultPanelController resController;
	private MyButton forwardButton;
	private SortVO sort;
	private String type;
	
	private MyLabel sortId,name,fatherSort;
	
	public ConfirmSortPanel(MyFrame frame, String url, CommodityAllUIController controller,SortVO sort,String type) {
		super(frame, url, controller);
		this.frame = frame;
		this.commodityAllUIController = controller;
		resController = new ResultPanelController(commodityAllUIController, frame);

		this.sort = sort;
		this.type = type;
		commodityAllUIController.setBack_first(this);
		setLabels();
		setForward();
	}
	private void setLabels() {
		sortId = new MyLabel(254, 204, 271, 42);
		name = new MyLabel(255, 323, 271, 42);
		fatherSort = new MyLabel(255, 442, 271, 42);
		MyLabel labels[] = new MyLabel[]{sortId,name,fatherSort};
		
//		labels[0].setText(sort.id);
//		labels[1].setText(sort.name);
//		labels[2].setText(sort.fatherSort);
		
		for(int i = 0;i < labels.length;i++){
			this.add(labels[i]);
			labels[i].setForeground(Color.white);
			labels[i].setFont(new FontFactory(24).font);
		}
	}
	private void setForward() {
		ForwardButton forward = new ForwardButton(573, 442);
		forwardButton = forward.forward_black;
		this.add(forwardButton);
		forwardButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == forwardButton){
			frame.remove(this);
			if(type.equals("add")){
				addSort();
				resController.succeeded("成功添加分类！", "commodity");
			}else if(type.equals("del")){
				delSort();
				resController.succeeded("成功删除分类！", "commodity");
			}else if(type.equals("cha")){
				chaSort();
				resController.succeeded("成功修改分类信息！", "commodity");
			}
				
			
		}
	}


	private void chaSort() {
		// TODO Auto-generated method stub
		
	}
	private void delSort() {
		// TODO Auto-generated method stub
		
	}
	private void addSort() {
		// TODO Auto-generated method stub
		
	}
}