import java.io.*;

public class BufferedReader
{
public BufferedReader(FileReader fileReader) {
		// TODO Auto-generated constructor stub
	}

public static void main(StringReader[] args) throws FileNotFoundException 

{
	File file = new File("C://rajesh/project1.txt");
	BufferedReader br =new BufferedReader(new FileReader(file));
	String st;
	while ((st = br.readLine()) != null);
	System.out.println(st);
	
	
	
	

}

private String readLine() {
	// TODO Auto-generated method stub
	return null;
}
}