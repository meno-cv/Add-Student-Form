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

	// ------------------------------------------------


	JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btAdd=new JButton("Add Student");
		btCancel=new JButton("Cancel");
		btAdd.setFont(new Font("",1,20));
		btCancel.setFont(new Font("",1,20));
		
		southPanel.add(btAdd);
		btAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				String id=txtStudentId.getText();
				String name=txtName.getText();
				int prfMarks=Integer.parseInt(txtPrfMarks.getText());
				int dbmsMarks=Integer.parseInt(txtDbmsMarks.getText());
				Student s1=new Student(id,name,prfMarks,dbmsMarks);
				studentList.add(s1);
			}
		});
		
		southPanel.add(btCancel);
		add("South",southPanel);


		
