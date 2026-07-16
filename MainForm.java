import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MainForm  extends JFrame{
	private JButton btUpdateStudent;
	private JButton btDeleteStudent;
	private JButton btAddStudent;
	private JButton btSearchStudent;
	private JButton btViewStudent;
	private JButton btExit;
	
	MainForm(){
		setSize(500,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel titleLabel=new JLabel("Student' Marks Management System");
		titleLabel.setFont(new Font("",1,27));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		add("North",titleLabel);
		//-------------------------------------------------------------
