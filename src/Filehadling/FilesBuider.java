package Filehadling;

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
}
