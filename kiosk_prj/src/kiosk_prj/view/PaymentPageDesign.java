package kiosk_prj.view;

import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import kiosk_prj.controller.PaymentPageEvent;

@SuppressWarnings("serial")
public class PaymentPageDesign extends JFrame {
	private JLabel orderPrice, lblCheckCouponGuide, totalPrice;
	private JButton btnCheckCoupon, creditCard, cash;
	private JTable orderMenuList;
	private DefaultTableModel dtmOrderMemuList;
	private Font font;

	public PaymentPageDesign() {
		// 수동 배치
		setLayout(null);

		// 총 상품 금액 표시 레이블
		JLabel jlorderPrice = new JLabel("총 상품금액");
		font = jlorderPrice.getFont();
		jlorderPrice.setFont(font.deriveFont(Font.PLAIN, 25));
		jlorderPrice.setBounds(150, 50, 150, 30);

		orderPrice = new JLabel("1200원");
		font = orderPrice.getFont();
		orderPrice.setFont(font.deriveFont(Font.PLAIN, 25));
		orderPrice.setBounds(340, 50, 150, 30);

		// 쿠폰 조회 & 안내 메시지
		btnCheckCoupon = new JButton("쿠폰 조회");
		btnCheckCoupon.setBounds(180, 110, 100, 30);

		lblCheckCouponGuide = new JLabel("<html>*전화번호로 보유쿠폰을 조회합니다.<br>*회원가입도 쿠폰조회에서!</html>");
		font = lblCheckCouponGuide.getFont();
		lblCheckCouponGuide.setFont(font.deriveFont(Font.PLAIN, 11));
		lblCheckCouponGuide.setBounds(180, 150, 200, 25);

		// 주문 메뉴 리스트
		String[] column = { "상품", "수량" };
		Object[][] data = { { "아메리카노", 1 }, { "가데이터 2", 2 }, { "가데이터 3", 3 }, };

		dtmOrderMemuList = new DefaultTableModel(data, column);
		orderMenuList = new JTable(dtmOrderMemuList);
		JScrollPane jspOrderMenuList = new JScrollPane(orderMenuList);
		jspOrderMenuList.setBounds(70, 200, 450, 250);

		// 총 결제 금액 표시 레이블
		JLabel jlTotalPrice = new JLabel("총 결제 금액");
		font = jlTotalPrice.getFont();
		jlTotalPrice.setFont(font.deriveFont(Font.PLAIN, 25));
		jlTotalPrice.setBounds(150, 470, 150, 30);

		totalPrice = new JLabel("1200원");
		font = totalPrice.getFont();
		totalPrice.setFont(font.deriveFont(Font.PLAIN, 25));
		totalPrice.setBounds(340, 470, 150, 30);

		// 결제 방법 선택 레이블 및 버튼
		JLabel jlPaymentMethod = new JLabel("결제 방법을 선택해주세요.");
		font = jlPaymentMethod.getFont();
		jlPaymentMethod.setFont(font.deriveFont(Font.PLAIN, 14));
		jlPaymentMethod.setBounds(213, 510, 200, 30);

		creditCard = new JButton("신용카드");
		creditCard.setBounds(120, 550, 150, 70);

		cash = new JButton("현금결제");
		cash.setBounds(300, 550, 150, 70);

		// 패널에 컴포넌트 추가
		add(jlorderPrice);
		add(orderPrice);
		add(btnCheckCoupon);
		add(lblCheckCouponGuide);
		add(jspOrderMenuList);
		add(jlTotalPrice);
		add(totalPrice);
		add(jlPaymentMethod);
		add(creditCard);
		add(cash);

		// actionListener 추가
		PaymentPageEvent ppe = new PaymentPageEvent(this);
		btnCheckCoupon.addActionListener(ppe);
		creditCard.addActionListener(ppe);
		cash.addActionListener(ppe);

		jspOrderMenuList.addMouseListener(ppe);

		addWindowListener(ppe);

		setVisible(true);
		setResizable(false);
		setSize(600, 800);
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// PaymentPageDesign

	public JLabel getOrderPrice() {
		return orderPrice;
	}

	public JLabel getLblCheckCouponGuide() {
		return lblCheckCouponGuide;
	}

	public JLabel getTotalPrice() {
		return totalPrice;
	}

	public JButton getBtnCheckCoupon() {
		return btnCheckCoupon;
	}

	public JButton getCreditCard() {
		return creditCard;
	}

	public JButton getCash() {
		return cash;
	}

	public JTable getOrderMenuList() {
		return orderMenuList;
	}

	public DefaultTableModel getDtmOrderMemuList() {
		return dtmOrderMemuList;
	}

	public static void main(String[] args) {
		new PaymentPageDesign();
	}// main

}// class
