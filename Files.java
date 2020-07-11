package com.simplilearn.proj;

import java.util.Scanner;

public class Files {
	
public static void main(String args[])
{
	PathFiles path=new PathFiles();
	char option='\0';
	Scanner s=new Scanner(System.in);
	System.out.println("Application Name");
	System.out.println("************************************************");
	System.out.println("Welcome");
	System.out.println("\n");
	System.out.println("A. View Files");
	System.out.println("B. Add Files");
	System.out.println("C. Delete Files");
	System.out.println("D. Exit");
	do {
		System.out.println("************************************************");
		System.out.println("Enter an option:");
		option=s.next().charAt(0);
		System.out.println("************************************************");
		switch(option)
		{
		case 'A':
			path.viewFiles();
			break;
		case 'B':
			System.out.println("Please enter a file to add:");
			String afname=s.next();
			path.addFiles(afname);
			break;
		case 'C':
			System.out.println("Please enter a file to remove:");
			String dfname=s.next();
			path.deleteFiles(dfname);;
			break;
		case 'D':
			System.out.println("Thanks for using this application");
			break;
		default:System.out.println("Invalid Option!! Please select a correct option");
		}
	}while(option!='D');
}

}
