package JavaCollectionFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		//String name;
		System.out.println("Start");
		arithmeticExceptions();
		//stackOverFlowExpection();
		nullPointerExceptions();
		classNotFoundExceptions();
		numberFormatExceptions();
		arrayIndexoutofBoundExceptions();
		try {
			fileNotFoundExceptions();
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found Exceptions Handled");
		}
		inputOutputExceptions();
		//illegalStateExceptions();
		outOfMemoryExceptions();
		System.out.println("End");

	}

	private static void outOfMemoryExceptions() {
		try {
			long data[] = new long[1000000000];
		} catch (OutOfMemoryError  r) {
			// TODO Auto-generated catch block
			System.out.println("Out of Memory Exceptions Handled");
		}
	}
	/*private static void illegalStateExceptions() {
		try {
			String s = "demo";
			Scanner sc = new Scanner(System.in);
			System.out.println(sc.nextLine());
			sc.close();
			System.out.println(sc.nextLine());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Illegal state Exceptions Handled");
		}
		
	}*/

	private static void inputOutputExceptions() {
		try {
			InputStreamReader isr = new InputStreamReader(null);
		} catch (Exception e) {
			System.out.println("Input Output Exceptions Handled");
		}
		
	}

	private static void arrayIndexoutofBoundExceptions() {
		try {
			int a[] = new int[4];
			System.out.println(a[5]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("array Index out of Bound Exceptions Handled");
		}
		
	}

	private static void classNotFoundExceptions() {
		try {
			Class.forName("asdfgh");
		} catch (ClassNotFoundException e) {
			
			System.out.println("Class not found Exceptions Handled");
		}
		
	}

	private static void fileNotFoundExceptions() throws FileNotFoundException {
		File file = new File("users/Nandhini/sdfgj.txt");
		FileInputStream fis = new FileInputStream(file);
		
	}

	private static void numberFormatExceptions() {
		try {
			String s = "data";
			int t = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Number Format Exceptions Handled");
		}
		
	}

	private static void nullPointerExceptions() {
		try {
			String name = null;
			System.out.println(name.concat("demo"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Null pointer Exceptions Handled");
		}	
	}

	private static void stackOverFlowExpection() {
		try {
			ArrayList<Integer> a = new ArrayList<Integer>();
			while (true)
			{
					a.add(2);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("StackOverFlowExceptions Handled");
		}
		
	}

	private static void arithmeticExceptions() {
		try {
			int a = 100/0;
		} catch (Exception e) {
			System.out.println("Arithmetic Exceptions handled");
		}
		
	}

}
