package Filehadling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;

public class Writter {
    public static void Write(File file,String Writing){
        FileWriter filesw=null;
        try {
            filesw = new FileWriter(file);
            BufferedWriter writer=new BufferedWriter(filesw);
            writer.write(Writing);
            writer.close();
        }
        catch (Exception e){}





    }
}

