import java.io.File;
import java.nio.file.*;
public class ReadingFile {
    private String fileNameAndWay;


    public String getFileNameAndWay(){
        return fileNameAndWay;
    }

    ReadingFile(String fileNameAndWay) {
        if(fileSearch(fileNameAndWay)){
            this.fileNameAndWay = fileNameAndWay;
            String[] fileName = fileNameAndWay.split("\\\\");
            System.out.println("File \""+fileName[fileName.length-1]+"\" found");
        }
        else{
            System.out.println("This file not found");
        }

    }

    private boolean fileSearch(String fileNameAndWay){
        return new File(fileNameAndWay).isFile();

    }
}


