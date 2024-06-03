//Write a program to write text to a file using FileWriter. (Write to a File)
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class L4Q1{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("abc.txt",true);
		fw.write("Hello World");
		fw.write("\n");
		fw.write("Files\n");
		fw.close();
		}
			
}
Output:
Hello World
Files
