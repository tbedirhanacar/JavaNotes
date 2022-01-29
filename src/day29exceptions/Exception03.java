package day29exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

	//How to read a text file line by line

public class Exception03 {

	public static void main(String[] args) {
		
		readTextFileLineByLine("src/day28exceptionsX/TextFile01");
		
	}
	
	public static void readTextFileLineByLine(String path) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(path));
			String line = br.readLine();
			while (line!=null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.err.println("Path is wrong or the file does not exist");
		} catch (IOException e) {
			System.err.println("For some readon the file cannot be read");
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				System.err.println("For some reason the file cannot be closed");
			} catch (NullPointerException e) {
				System.err.println("You cannot close non-existing file");
			}
		}
			
	}

}
