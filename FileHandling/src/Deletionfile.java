import java.io.File;

public class Deletionfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("studyeasy\\\\author\\\\anju\\\\test.txt");
		if(file.delete())//returns boolean value
		{
			System.out.println("Deletion done");
		}
		else
		{
			System.out.println("Error while Deleting");
		}
	}

}
