package com.simplilearn.proj;

import java.util.ArrayList;


public class PathFiles {
	ArrayList<String> files=new ArrayList<String>();
	void viewFiles() {
		if(files.isEmpty()) {
			System.out.println("No Files are present");
		}
		else {
			System.out.println("Files:");
			System.out.println(files);
		}
	}
	void addFiles(String file)
	{
		files.add(file);
		System.out.println("File has been added successfully");
	}
	void deleteFiles(String file)
	{
		if(files.contains(file))
		{
			files.remove(file);
			System.out.println("File has been deleted");
		}
		else
			System.out.println("File does not exist");
	}
}
