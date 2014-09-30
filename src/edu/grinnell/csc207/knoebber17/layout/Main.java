package edu.grinnell.csc207.knoebber17.layout;

import java.io.PrintWriter;

public class Main {
	public static void main(String args[]) throws Exception 
	{
		PrintWriter pen = new PrintWriter(System.out);
		TextLine tb1 = new TextLine("Hello");
		TextLine tb2 = new TextLine("World");
		pen.println("ORIGINAL");
		
		pen.close();
	}
}
