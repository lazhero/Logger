package Filehadling;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public static ArrayList<String> Read(File file){
        ArrayList<String> List=new ArrayList<String >();
        try {
            Scanner myreader = new Scanner(file);
            while(myreader.hasNext()){
                List.add(myreader.nextLine());
            }
        }
        catch (Exception e){}
        return List;
    }
}
