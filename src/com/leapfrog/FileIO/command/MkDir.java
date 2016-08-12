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
public class MkDir extends DosCommand{

    @Override
    public void execute(String[] cmd) {
      File file=new File(cmd[1]);//To change body of generated methods, choose Tools | Templates.
      file.mkdir();
    }
    
    
}
