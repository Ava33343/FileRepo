package gui.jav.modifier;

import java.io.File;
import java.util.Scanner;

/* RepoScanner Optimization 
  Reduce time from O(N) to O(logN)*/

public class BinarySearch extends RepoScanner{
    public static  void main(String[] args){
    	
        // Creates an array in which we will store the names of files and directories
        String[] pathnames;

        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File f = new File("//Users//ava//OneDrive//github//java//FileRepo//Repo");
  
        // Populates the array with names of files and directories
        pathnames = f.list();

        Scanner scr = new Scanner(System.in);
		System.out.println("Which file are you looking for?"); 

        String fileName = scr.nextLine();
        int arrlength = (pathnames.length-1); // please consider the total array length here i.e 5 
        binarySearch(pathnames,0,fileName,arrlength);
    
    }

	public static void binarySearch(String[] pathnames, int start, String fileName, int length){
	
	        int midValue = (start+length)/2;
	        while(start<=length){
	
	            if(pathnames[midValue]!=fileName){
	                start = midValue + 1;
	            } else if(pathnames[midValue]==fileName){
	                System.out.println("File is found at index :"+midValue);
	                break;
	            }else {
	
	                length=midValue-1;
	            }
	        }
	            if(start>length){
	
	                System.out.println("File is not found");
	            }      
	    }
}
/* 
 TODO
 Debug Console output on existing files
 since fileName is a string instead of a numeric value, 
 String[] pathnames shall be searched in both left and right halves 
 */
