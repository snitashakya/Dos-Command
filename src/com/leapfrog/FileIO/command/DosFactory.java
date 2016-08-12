/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FileIO.command;

/**
 *
 * @author ASUS
 */
public class DosFactory {

    public static DosCommand get(String param) {
        if (param.equalsIgnoreCase("md")) {
            return new MkDir();
        } else if (param.equalsIgnoreCase("rd")) {
            return new RdDir();
            } else if (param.equalsIgnoreCase("ren")) {
            return new RenameCommand();
              } else if (param.equalsIgnoreCase("copy")) {
            return new CopyCon();
             } else if (param.equalsIgnoreCase("del")) {
            return new Delete();
            } else if (param.equalsIgnoreCase("dir")) {
            return new DirCommand();
            } else if (param.equalsIgnoreCase("vi")) {
            return new vi();
            
        } else {
            return null;
        }
    }

}
