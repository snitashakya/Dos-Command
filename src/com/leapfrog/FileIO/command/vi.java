/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FileIO.command;

import java.io.BufferedReader;
import java.io.File;
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
public class vi extends DosCommand {

    @Override
    public void execute(String[] cmd) {
        //File file = new File(cmd[1]);
        String line = "";
        StringBuilder content=new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (!((line = reader.readLine()).equalsIgnoreCase("exit"))) {
                content.append(line).append("\r\n");
              // System.out.println(line);
            }
           // reader.close();
            FileWriter writer=new FileWriter(cmd[1]);
            writer.write(content.toString());
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
