package kiosks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import kiosks.PaymentPageDesign;
import kiosks.PhoneNumDesign;
import kiosks.UsingCouponDesign;

public class UsingCouponEvent extends WindowAdapter implements ActionListener, MouseListener{

	private UsingCouponDesign ucd;
	private PhoneNumDesign pnd;
	
	public UsingCouponEvent(UsingCouponDesign ucd, PhoneNumDesign pnd) {
		this.ucd = ucd;
		this.pnd = pnd;
	}//UsingCouponEvent
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ucd.getCancel()) {
			pnd.dispose();
		}
		
		if(e.getSource() == ucd.getUse()) {
			pnd.dispose();
		}
	}//actionPerformed
	
	

	@Override
	public void windowClosing(WindowEvent e) {
		pnd.dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		pnd.dispose();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

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
