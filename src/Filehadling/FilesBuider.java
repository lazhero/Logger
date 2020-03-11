package Filehadling;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class FilesBuider {
    private static FilesBuider instance=null;
    private static int InstancesNumber;
    private FilesBuider(){

    }
    public static FilesBuider InstanceCreator(){
        if(instance==null){
            instance=new FilesBuider();
        }
       return instance;

    }
    @NotNull
    public static File BuildFile(String Title){
        String IDstring=Integer.toString(InstancesNumber);
        File file=new File(Title+IDstring);
        InstancesNumber++;
        return file;
    }
}
