package Logger;

import Filehadling.FilesBuider;
import Filehadling.Reader;
import Filehadling.Writter;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.ArrayList;

public class Logger {
    File file;
    ArrayList<String> ErrorList=new ArrayList<String>();
    public Logger(){

        FilesBuider FBuilder=FilesBuider.InstanceCreator();
        file=FBuilder.BuildFile("Logger");
    }
    public void ErrorReport(@NotNull Exception e){
        String text=e.getMessage();
        if(!text.equalsIgnoreCase("Salto de linea")){
            Writter.Write(file,text);
        }

    }
    public void UpdateError(){
        ErrorList= Reader.Read(file);
    }
    public void nextline(){
        Writter.Write(file,"Salto de linea");
    }

}
