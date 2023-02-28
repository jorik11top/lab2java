import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.*;
public class ReadingFile {
    private String fileNameAndWay;

    public ReadingFile(){

    }
    public ReadingFile(String fileNameAndWay) {
        if(fileSearch(fileNameAndWay)){
            this.fileNameAndWay = fileNameAndWay;
            String[] fileName = fileNameAndWay.split("\\\\");
            System.out.println("File \""+fileName[fileName.length-1]+"\" found");
        }
        else{
            System.out.println("This file not found");
        }

    }


    public String getFileNameAndWay(){
        return fileNameAndWay;
    }

    public boolean fileSearch(String fileNameAndWay){
        return new File(fileNameAndWay).isFile();
    }

    public void countСharAz()throws java.io.IOException{
        try(FileReader file = new FileReader(this.fileNameAndWay)) {
            int symb;
            while ((symb = file.read()) != -1){
                System.out.println((char) symb);
            }
        }
        catch(FileNotFoundException f){
            System.out.println("This file does not exist");
        }

    }
}


