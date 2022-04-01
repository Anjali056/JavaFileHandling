import java.io.File;
import java.io.IOException;

public class fileHandlingMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File file = new File("src/StudyEasy.txt");
		//file.createNewFile();//create a file
		//System.out.println("File created");
		
		File directory=new File("studyeasy\\author\\anju");
		//directory.mkdir();//create folder
		directory.mkdirs();//to create multiple sub folders
		System.out.println("directory created");
		
		File file = new File("studyeasy\\author\\anju\\test.txt");
		file.createNewFile();//to create a file in sub folders
		System.out.println("File created");
		
		
		
		}

}
