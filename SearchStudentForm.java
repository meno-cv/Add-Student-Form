import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
class SearchStudentForm  extends JFrame{
	private JTextField txtStudentId;
	private JTextField txtName;
	private JTextField txtPrfMarks;
	private JTextField txtDbmsMarks;
	
	private JButton btCancel;
	private JButton btSearch;

    //-------------------------------------------------------------
		
		JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btSearch=new JButton("Search Student");
		btCancel=new JButton("Cancel");
		btSearch.setFont(new Font("",1,20));
		btSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				try{
					Scanner input=new Scanner(new File("Student.txt"));
					String id=txtStudentId.getText();
					String[] rowData=null;
					while(input.hasNext()){
						String line=input.nextLine();
						rowData=line.split(",");
						if(rowData[0].equalsIgnoreCase(id)){
							break;
						}
					}
					txtName.setText(rowData[1]);
					txtPrfMarks.setText(rowData[2]);
					txtDbmsMarks.setText(rowData[3]);
				}catch(IOException ex){}
				
			}
		});
