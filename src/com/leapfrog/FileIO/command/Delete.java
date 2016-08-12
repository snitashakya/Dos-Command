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
public class Delete extends DosCommand{

    @Override
    public void execute(String[] cmd) {
       File file=new File(cmd[1]);
       file.delete();
    }
    
}
