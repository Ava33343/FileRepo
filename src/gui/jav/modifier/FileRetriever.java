package gui.jav.modifier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Arrays;

public class FileRetriever extends RepoScanner {
	

    public static void main(String[] args) {
        // Creates an array in which we will store the names of files and directories
        String[] pathnames;

        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File f = new File("//Users//ava//OneDrive//github//java//FileRepo//Repo");
  
        // Populates the array with names of files and directories
        pathnames = f.list();
        
        /*
        // Print out unsorted file titles
        // For each pathname in the pathnames array
        for (String pathname : pathnames) {
            // Print the names of files and directories
            System.out.println(pathname);
         */
        
        // Sorted titles printed out using arrays.sort
    	Arrays.sort(pathnames);
        System.out.printf("File names in ascending order: \n %s ", Arrays.toString(pathnames));

        }
    
}
   

/* 
 TODO backlog
 Sort files in alphanumeric order (completed with Arrays.sort)
 Optimize sorting algorithm:
 Array.sort implements Timsort with time complexity of 
 O(N) < x < O(NlogN) and space complexity of O(N).
 A dual pivot quicksort algorithm of faster speed on numeric values compared to objects.
 */

/* 
TODO backlog
Go one folder up @Line 17
File f = new File("//Users//ava//OneDrive//github//java//FileRepo");
	<- BFS or DFS needed to go deeper down into the file folder as optimization instead of recursion
*/
        
	    
//	    public class ListFilesRecursively {
//	        public void listFiles(String startDir) {
//	            File dir = new File(startDir);
//	            File[] files = dir.listFiles();
//
//	            if (files != null && files.length > 0) {
//	                for (File file : files) {
//	                    // Check if the file is a directory
//	                    if (file.isDirectory()) {
//	                        // We will not print the directory name, just use it as a new
//	                        // starting point to list files from
//	                        listDirectory(file.getAbsolutePath());
//	                    } else {
//	                        // We can use .length() to get the file size
//	                        System.out.println(file.getName() + " (size in bytes: " + file.length()+")");
//	                    }
//	                }
//	            }
//	        }
//	        public static void main(String[] args) {
//	            ListFilesRecursively test = new ListFilesRecursively();
//	            String startDir = ("//Users//ava//OneDrive//github//java//FileRepo");
//	            test.listFiles(startDir);
//	        }
//	    }
//	}

/* 
References:
https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
https://stackabuse.com/java-list-files-in-a-directory/	
https://stackoverflow.com
https://stackoverflow.com/questions/28947250/create-a-directory-if-it-does-not-exist-and-then-create-the-files-in-that-direct/28948104
*/