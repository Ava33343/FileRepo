package gui.jav.modifier;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class RepoScanner extends JFrame implements ActionListener {

   private JTextArea textArea = new JTextArea();
   private JButton read = new JButton("Open File");
   private JButton write = new JButton("Save File");
   private JTextField nameField = new JTextField(20);
   private JLabel file = new JLabel("File Name");
   private JPanel innerWindow =  new JPanel();

   public RepoScanner(){

        super("RepoScanner - The Superfantastic Text Editor");

        // layout of the user interface
        innerWindow.setLayout(new GridLayout(2,2,1,1));

        // add buttons
        innerWindow.add(read);
        innerWindow.add(write);
        innerWindow.add(nameField);
        innerWindow.add(file);

        // a border layout
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add("North",innerWindow);
        this.getContentPane().add( new JScrollPane(textArea)  );
        this.getContentPane().add( "Center",textArea);


        // background color for the windows
        innerWindow.setBackground(Color.yellow);
        textArea.setBackground(Color.orange);

        // text area italic for inserted texts
        textArea.setFont(new Font("Serif", Font.ITALIC, 20));
        nameField.setFont(new Font("Arial", Font.BOLD, 23));

        read.addActionListener(this);
        write.addActionListener(this);
   }

   public static void main(String[] args) {

        RepoScanner window = new RepoScanner();

        // set size of the interface window displayed
        window.setSize(500, 300);
        
        window.setVisible(true);
        // feature to close and shut down the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }//end main

   //reads from a text file.  Eclipse will look for it at the Project Folder
   private void readTextFile(JTextArea textArea, String fileName) {

       try {
           BufferedReader inStream // Create and
                   = new BufferedReader(new FileReader(fileName));

           String line = inStream.readLine();            // Read one line

           while (line != null) {                        // While more text
               textArea.append(line + "\n");              // textArea a line
               line = inStream.readLine();               // Read next line
           }
           inStream.close();                             // Close the stream

       } catch (FileNotFoundException e) {
           textArea.setText("IOERROR: File NOT Found: " + fileName + "\n");
           e.printStackTrace();

       } catch (IOException e) {
           textArea.setText("IOERROR: " + e.getMessage() + "\n");
           e.printStackTrace();
       }
   } // end readTextFile


   //writes to a text file.  Eclipse will look for it at the Project Folder
   private void writeTextFile(JTextArea textArea, String fileName) {

       try {
           FileWriter outStream = new FileWriter(fileName);
           outStream.write(textArea.getText());
           outStream.close();

       } catch (IOException e) {
           textArea.setText("IOERROR: " + e.getMessage() + "\n");
           e.printStackTrace();
       }
   } // end writeTextFile()


   //watches the button and waits until it is clicked

   public void actionPerformed(ActionEvent evt) {

        String fileName = nameField.getText();

        if (evt.getSource() == read) {
            textArea.setText("");
            readTextFile(textArea, fileName);
            
        } else {
            writeTextFile(textArea, fileName);
        }
   }//end actionPerformed()

}//end class



/* 
References:
https://www.bilibili.com/video/BV19T4y1M7aH
	
*/