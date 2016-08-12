/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FileIO;

import com.leapfrog.FileIO.command.DosCommand;
import com.leapfrog.FileIO.command.DosFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        File file;
        /* file = new File("test/.././file.txt");
         System.out.println("is Directory :"+file.isDirectory());
         System.out.println("is file "+file.isFile());
         System.out.println("is path "+file.isAbsolute());
         System.out.println("is Hidden " +file.isHidden());
         System.out.println("Get absolute path "+file.getAbsolutePath());
      
         //    System.out.println("get canonial path "+file.getCanonicalPath());
       
         System.out.println(" get path "+file.getPath());*/
        String path = "C:/Users/ASUS/Desktop/green.txt";
        /*  file = new File(path);
         if (file.exists()) {
         try {
         file.delete();
         file.createNewFile();
         FileWriter fw=new FileWriter(path);
         fw.write("1,Computer,pc");
         fw.close();
         } catch (IOException ioe) {
         System.out.println(ioe.getMessage());

         }
         System.out.println("is Directory :" + file.isDirectory());
         System.out.println("is file " + file.isFile());
         }*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Line = "";
        File file1;
        file1 = new File(".");
        String path1;
        path1 = file1.getAbsolutePath();
        System.out.print(path1 + ">");
        while (!((Line = br.readLine()).equalsIgnoreCase("exit"))) {
            String[] tokens = Line.split(" ");
            DosCommand cmd = DosFactory.get(tokens[0]);
            if (cmd != null) {
                cmd.execute(tokens);
            } else 
            {
                System.out.println("invalid");
            }
            System.out.print(path1 + ">");
        }

    }

}
