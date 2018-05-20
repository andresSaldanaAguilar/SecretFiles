
package proyecto;

import Hash.Hash;
import WAVE.Wav;
import java.io.File;
import java.io.IOException;
import Process.Process;
import java.util.Arrays;

/**
 *
 * @author miguel
 */
public class Proyecto {


    
    
    
    public static void main(String[] args) throws IOException {
        File fileWave=new   File("/Users/andressaldana/Documents/Github/SecretFiles/fileTests/Calvin Harris copy.wav");
        File fileToHide=new File("/Users/andressaldana/Documents/Github/SecretFiles/fileTests/app.png");
        File outputFile=new File("/Users/andressaldana/Documents/Github/SecretFiles/files/salida.wav");
        String instance="AES";
        String mode="OFB";//"ECB", "CBC", "OFB", "CFB"
        String keyAES="asdfghjklzxcvbnm";
         String keyDES="asdfghjk";
        String nombre="salida.png";
        Process p=new Process();
        p.hide(fileWave, fileToHide, outputFile, instance, mode, keyAES,nombre);
        p.uncover(outputFile,  keyAES, instance, mode);
     }
    
}
