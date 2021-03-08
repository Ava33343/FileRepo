package gui.jav.modifier;

import java.io.IOException; 
import java.nio.file.*; 
import java.io.File;

//Java program to demonstrate delete if exists using Files class 

public class FileDeletion extends RepoScanner
{ 
	public static void main(String[] args) 
	{ 
		try
		{ 
			Files.deleteIfExists(Paths.get("//Users//ava//OneDrive//github//java//FileRepo//Repo//test.txt")); 
		} 
		catch(NoSuchFileException e) 
		{ 
			System.out.println("No such file/directory exists"); 
		} 
		catch(DirectoryNotEmptyException e) 
		{ 
			System.out.println("Directory is not empty."); 
		} 
		catch(IOException e) 
		{ 
			System.out.println("Invalid permissions."); 
		} 
		
		System.out.println("Deletion successful."); 
	} 
} 

/*
 TODO
 Add a button on RepoScanner GUI to integrate deletion function specified here.
 */

/* 
 Reference
https://www.geeksforgeeks.org/delete-file-using-java/
 */