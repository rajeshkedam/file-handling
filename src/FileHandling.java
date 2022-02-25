import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;



public class FileHandling {

	public static void main(String[] args) throws IOException {
		File file= new File("c://rajesh/project1.txt");
		if(file.createNewFile()) {
			System.out.println("File created succesfully");
		} else {
			System.out.println("File is already exist");
		}
		String data = "folks... Hello";
		/*FileOutputStream fos = new FileOutputStream(file);
		fos.write(data.getBytes());
		fos.close();*/
		FileWriter writer = new FileWriter(file);
		writer.append(data);
		writer.append(data);
		writer.close();
		
		

	}

}
