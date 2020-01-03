package com.files;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesHanling {

	public static void main(String[] args) throws IOException {
		
		/*File file=new File("E:\\fileName.txt");
		
		//create  file
		if(file.createNewFile()){
			System.out.println("file create"+file.getName());
		}else{
			System.out.println("file is not created");
		}*/
		
		// write some text into fiele
		
		/*FileWriter fwriter=new FileWriter("E:\\fileName.txt");
		fwriter.write("hi this is wrte from java");
		 System.out.println("Successfully wrote to the file.");
		 fwriter.close();*/
		/*File file=new File("E:\\fileName.txt");
		Scanner sc=new Scanner(file);
		String data = sc.nextLine();
		System.out.println(data);*/
	
	/*File file=new File("E:\\fileName.txt");
	if (file.exists()) {
	      System.out.println("File name: " + file.getName());
	      System.out.println("Absolute path: " + file.getAbsolutePath());
	      System.out.println("Writeable: " + file.canWrite());
	      System.out.println("Readable " + file.canRead());
	      System.out.println("File size in bytes " + file.length());
	    } else {
	      System.out.println("The file does not exist.");
	    }*/
		
		FileOutputStream fout1=new FileOutputStream("E:\\fileName.txt");    
	    FileOutputStream fout2=new FileOutputStream("E:\\file.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(65);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
	      System.out.println("Success...");    
	     }    

}
