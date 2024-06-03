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

//2)Write a program to read text from a file using FileReader. (Read from a File)
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
class L4Q2{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("abc.txt");
		int i ;
		while((i=fr.read())!=-1){
			System.out.println((char)i);
			}
		}
			
}
Output:
H
e
l
l
o
 
W
o
r
l
d


F
i
l
e
s
// 

