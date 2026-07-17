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
        
			
		JPanel buttonPanel=new JPanel(new GridLayout(6,1));
		btAddStudent=new JButton("Add Student Form");
		btAddStudent.setFont(new Font("",1,20));
		btAddStudent.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				new AddStudentForm().setVisible(true);
			}
		});
		buttonPanel.add(btAddStudent);

		btViewStudent=new JButton("View Student Form");
		btViewStudent.setFont(new Font("",1,20));
		buttonPanel.add(btViewStudent);
		
		btSearchStudent=new JButton("Search Student Form");
		btSearchStudent.setFont(new Font("",1,20));
		buttonPanel.add(btSearchStudent);
		btSearchStudent.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				new SearchStudentForm().setVisible(true);
			}
		});

		btDeleteStudent=new JButton("Delete Student Form");
		btDeleteStudent.setFont(new Font("",1,20));
		buttonPanel.add(btDeleteStudent);
		btDeleteStudent.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
			}
		});

		btExit=new JButton("Exit");
		btExit.setFont(new Font("",1,20));
		buttonPanel.add(btExit);
		add("Center",buttonPanel);
	}
	public static void main(String args[]){
		new MainForm().setVisible(true);	
	}
}