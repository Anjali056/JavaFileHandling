import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ReadingFile {

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
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			System.out.println("Error occured,while writing into the file");
			e.printStackTrace();
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("Write\\team.txt"));
			String line;
			System.out.println("********************************** ");
			while((line=br.readLine())!=null)//store the contents of file in line and check if its not null
			{
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println("FileNotFoundException");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException ");
			e.printStackTrace();
		}
		
		/*Reading a file using Scanner
		try {
			Scanner sc=new Scanner(new File("Write\\team.txt"));
			String line;
			while(sc.hasNext())
			{
				line=sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
