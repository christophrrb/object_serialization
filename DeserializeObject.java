import java.io.*;

public class DeserializeObject {

	private static ObjectInputStream in;
       	static {
		try {
			in = new ObjectInputStream(new FileInputStream("serializedObject.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main (String[] args) {
		try {
			System.out.println((Employee) in.readObject());
			in.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
