package Filehadling;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class FilesBuider {
    public static FilesBuider instance=null;
    public static int InstancesNumber;
    private FilesBuider(){

    }
    public static FilesBuider InstanceCreator(){
        if(instance==null){
            instance=new FilesBuider();
        }
       return instance;

    }
    @NotNull
    public static File BuildFile(){
        String IDstring=Integer.toString(InstancesNumber);
        File file=new File("File"+IDstring);
        InstancesNumber++;
        return file;
    }
}
