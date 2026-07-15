import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AddStudentForm  extends JFrame{
	private JTextField txtStudentId;
	private JTextField txtName;
	private JTextField txtPrfMarks;
	private JTextField txtDbmsMarks;
	
	private JButton btCancel;
	private JButton btAdd;
	
	private StudentList studentList;
	AddStudentForm(StudentList studentList){
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.studentList=studentList;
		JLabel titleLabel=new JLabel("Add Student Form");
		titleLabel.setFont(new Font("",1,27));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		add("North",titleLabel);
