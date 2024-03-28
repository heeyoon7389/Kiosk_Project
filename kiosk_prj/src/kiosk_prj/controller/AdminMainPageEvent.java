package kiosk_prj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;

import easterEgg.EasterEggDesign;
import kiosk_prj.adminMain.AdminMainPageDesign;
import kiosk_prj.membership.MemberShipDesign;
import kiosk_prj.orderStatus.OrderStatusDesign;

public class AdminMainPageEvent extends WindowAdapter implements ActionListener, MouseListener {
	
	private AdminMainPageDesign amod;
	private JButton jbCoffee, jbNonCoffee, jbTea, jbSmoothie, jbAll,
				jbMeniInfo, jbOrderStatus, jbSales, jbOpen, jbClosd,
				jbUserManagement, jbOperate, jbCoupon, jbTrends;
	
	public AdminMainPageEvent(AdminMainPageDesign amod) {
		this.amod = amod;
		
		JButton jbArr[] = amod.getArrJbMenuFilter();
		jbCoffee = jbArr[0];
		jbNonCoffee = jbArr[1];
		jbTea = jbArr[2];
		jbSmoothie = jbArr[3];
		jbAll = jbArr[4];
		
		jbMeniInfo = amod.getJbMeniInfo();
		jbOrderStatus = amod.getJbOrderStatus();
		jbSales = amod.getJbSales();
		jbOpen = amod.getJbOpen();
		jbClosd = amod.getJbClosd();
		jbUserManagement = amod.getJbUserManagement();
		jbOperate = amod.getJbOperate();
		jbCoupon = amod.getJbCoupon();
		jbTrends = amod.getJbTrends();
		
	}//AdminMainPageEvent

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbCoffee) {
			System.out.println("ㅁㄴㅇㄻㄴㅇㄹ");
		}//end if
		if(e.getSource() == jbOpen) {
			System.out.println("open");
		}//end if
		if(e.getSource() == jbUserManagement) {
			new MemberShipDesign(amod, null, null);
		}
		if(e.getSource() == jbOrderStatus) {
			new OrderStatusDesign(amod);
		}
		if(e.getSource() == amod.getJbEasterEgg()) {
			new EasterEggDesign(amod, "");
		}
	}//actionPerformed

	@Override
	public void mouseClicked(MouseEvent e) {
		//jtable용?
		
		
	}//mouseClicked

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}//class
