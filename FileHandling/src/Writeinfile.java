import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writeinfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("Write");
		file.mkdir();
		file=new File("Write\\team.txt");
		try {
			file.createNewFile();
			System.out.println("File created");
		} catch (IOException e) {
			System.out.println("Error occured while creating a file");
			e.printStackTrace();
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){//boolean append=true ,to append into the file
			
			bw.write("Hello");//writing the contents into file
			bw.newLine();
			bw.write("How are you?");
			bw.newLine();
			bw.write("Fine");
			bw.close();
		} catch (IOException e) {
			System.out.println("Error occured,while writing into the file");
			e.printStackTrace();
		}

	}

}
