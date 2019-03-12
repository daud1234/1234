package testfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCreator { 
   public static void main(String[] args) throws IOException {
	   PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
	   writer.println("The first line");
	   writer.println("The second line");
	   writer.close();  // creates a text file with some texts
	   
	   //------------------------
	   
	   File file = new File("C:\\Users\\daud.ali\\Desktop\\the-file-name.txt"); 
	   
	   BufferedReader br = new BufferedReader(new FileReader(file)); 
	   
	   String st; 
	   while ((st = br.readLine()) != null) 
		     System.out.println(st); 
	   
	   // reads a text file from drive/directory	   
	   //------------------------
	     Scanner sc = new Scanner(System.in);//initiliaze scanner to get user input
	     StringBuffer stringBufferOfData = new StringBuffer();

	     System.out.println("Please enter the contents of a line you would like to edit: ");//prompt for a line in file to edit
	        String lineToEdit = sc.nextLine();//read the line to edit
	        System.out.println("Please enter the the replacement text: ");//prompt for a line in file to replace
	        String replacementText = sc.nextLine();//read the line to replace
	        //System.out.println(sb);//used for debugging to check that my stringbuffer has correct contents and spacing
	        int startIndex = stringBufferOfData.indexOf(lineToEdit);//now we get the starting point of the text we want to edit
	        int endIndex = startIndex + lineToEdit.length();//now we add the staring index of the text with text length to get the end index
	        stringBufferOfData.replace(startIndex, endIndex, replacementText);//this is where the actual replacement of the text happens
	        System.out.println("Here is the new edited text:\n" + stringBufferOfData); //used to debug and check the string was replaced
	     
	     
}
}