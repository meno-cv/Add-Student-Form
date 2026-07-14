import java.util.*;
import java.io.*;
class Demo{
	public static void main(String args[])throws IOException{
		Scanner input=new Scanner(new File("Demo.java"));
		FileWriter fw=new FileWriter("Demo.txt");
		
		while(input.hasNext()){
			String line=input.nextLine();
			fw.write(line+"\n");
			System.out.println(line);
		}
		input.close();
		fw.close();
	}
}
