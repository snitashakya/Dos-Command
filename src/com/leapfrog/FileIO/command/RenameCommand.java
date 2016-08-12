/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FileIO.command;

import java.io.File;

/**
 *
 * @author ASUS
 */
public class RenameCommand extends DosCommand{

    @Override
    public void execute(String[] cmd) {
        if (cmd.length>2)
      new File(cmd[1]).renameTo(new File(cmd[2]));//To change body of generated methods, choose Tools | Templates.
     else
            System.out.println("Not enough Parameter");
    }
    
    
}
