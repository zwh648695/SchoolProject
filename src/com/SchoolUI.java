package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SchoolUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField chi;
	private JTextField name;
	private JTextField eng;
	private JTextField math;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchoolUI frame = new SchoolUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SchoolUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(169, 169, 169));
		panel.setBounds(34, 6, 559, 90);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("學校錄取系統");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(205, 24, 165, 45);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(171, 240, 237));
		panel_1.setBounds(34, 108, 559, 197);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("姓名：");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(41, 18, 61, 26);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("國文：");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(294, 15, 61, 32);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("英文：");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(41, 74, 61, 35);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("數學：");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(294, 75, 61, 32);
		panel_1.add(lblNewLabel_4);
		
		chi = new JTextField();
		chi.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		chi.setBackground(new Color(234, 234, 234));
		chi.setBounds(351, 13, 136, 43);
		panel_1.add(chi);
		chi.setColumns(10);
		
		name = new JTextField();
		name.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		name.setBackground(new Color(234, 234, 234));
		name.setBounds(96, 13, 136, 43);
		panel_1.add(name);
		name.setColumns(10);
		
		eng = new JTextField();
		eng.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		eng.setBackground(new Color(234, 234, 234));
		eng.setBounds(96, 73, 136, 43);
		panel_1.add(eng);
		eng.setColumns(10);
		
		math = new JTextField();
		math.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		math.setBackground(new Color(234, 234, 234));
		math.setBounds(351, 73, 136, 43);
		panel_1.add(math);
		math.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(238, 174, 46));
		panel_2.setBounds(34, 317, 559, 244);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea show = new JTextArea();
		show.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		show.setBounds(42, 6, 467, 232);
		panel_2.add(show);
		
		/****Button 計算*****/
		JButton btnNewButton = new JButton("確定");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				/*
				 * 1.擷取 getText()-->name,chi,eng,math，可以先測試：show-->setText()
				 * 2.使用建構式建立物件，School s=new School();
				 */
				
				String Name=name.getText();
				String Chi=chi.getText();
				String Eng=eng.getText();
				String Math=math.getText();
				
				Integer C=new Integer(Chi);
				Integer E=new Integer(Eng);
				Integer M=new Integer(Math);
				
				School s=new School(Name,C,E,M);
				
				if(s.getSum()>=200)
				{
					if(s.getEng()>=75)
					{
						show.setText(s.Success());
					}
					else
					{
						show.setText(s.engError());
					}
				}
				else
				{
					show.setText(s.sumError());
				}
				
//				show.setText(s.show());
			}
		});
		btnNewButton.setBounds(206, 128, 138, 60);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		
		JButton btnNewButton_1 = new JButton("清除");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				name.setText("");
				chi.setText("");
				eng.setText("");
				math.setText("");
				show.setText("");
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_1.setBounds(351, 128, 138, 60);
		panel_1.add(btnNewButton_1);
	}
}
