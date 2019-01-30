import java.io.*;

public class SerializeObject {

	private static FileOutputStream fout;
        private static ObjectOutputStream out;

	static {
		try {
			fout = new FileOutputStream("serializedObject.txt");	
			out = new ObjectOutputStream(fout);
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("There was a problem with the ObjectOutputStream.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Employee eOne = new Employee("John", "Stack Overflow Employee");
		Employee eTwo = new Employee("Sam", "Coder");

		try {
			out.writeObject(eOne);
			out.flush();
			fout.close();
			System.out.println("Object serialized!");
		} catch (IOException e) {
	       		e.printStackTrace();	
		}
	}
	
//	public void SerializeObject
}
