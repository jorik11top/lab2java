import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

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

    public void countCharAz()throws java.io.IOException{
        try(FileReader file = new FileReader(this.fileNameAndWay)) {
            int symb;
            int countHighReg = 0;
            int countLowReg = 0;
            while ((symb = file.read()) != -1){
                if(symb >= 'a' && symb <= 'z'){
                    countLowReg++;
                }
                else if (symb >= 'A' && symb <= 'Z') {
                    countHighReg++;
                }
            }
            System.out.println("High registr: "+countHighReg);
            System.out.println("Low registr: "+countLowReg);
            newFile(countHighReg,countLowReg,writeWay());
        }
        catch(NullPointerException f){
            System.out.println("This file does not exist");
        }

    }
    private void newFile(int highReg,int lowReg,String wayAndNameFile) throws IOException {

        try (FileOutputStream file = new FileOutputStream(wayAndNameFile)){
            file.write(("High registr: "+ highReg+ "\n").getBytes());
            file.write(("Low registr: "+ lowReg).getBytes());
            System.out.println("The data is written to a file");
        }
        catch(FileNotFoundException e){
            System.out.println("This directory not found");
        }
    }
    private String writeWay(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the path and file name where you want to save the data");
        System.out.println("(You can enter the name of a new file or overwrite an existing one)");
        System.out.print("Enter the path and file name: ");
        return in.nextLine();
    }

}


