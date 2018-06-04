/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author andressaldana
 */
public class Finder {
    
    public String listFilesForFolder(final File folder,String filename) throws IOException {
        String result = "";
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {} 
            else {
                if(fileEntry.getName().contains(filename.split("\\.")[0])){
                    result = fileEntry.getCanonicalPath();
                }               
            }
        }
        return result;
    }
    
    
    // /Users/andressaldana/apache-tomcat-8.5.30/bin/

    public static void main(String args[]) throws IOException{

        File directory = new File(System.getProperty("user.dir")+"/files/");
        if (! directory.exists()){
            directory.mkdir();
        }
    }
}
