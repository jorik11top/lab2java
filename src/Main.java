import java.io.IOException;
import java.util.Scanner;
//C:\tests\file1test.txt
//C:\tests\count.txt
//C:\tests\angel.jpg
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        ReadingFile file = new ReadingFile();
        while(true){
            int userSelection;
            System.out.println("What do you want to do?(Enter a number)");
            System.out.println("1-Enter file for next work");
            System.out.println("2-Count the number of letters of the English alphabet of both registers");
            System.out.println("3-exit the program");
            System.out.print("Your choice:");
            userSelection = in.nextInt();
            switch (userSelection){
                case (1):
                    System.out.print("Enter the path and file names:");
                    String wayAndName = str.nextLine();
                    file = new ReadingFile(wayAndName);
                    break;
                case (2):
                    if(file.getFileNameAndWay() == null){
                        System.out.println("You didn't specify any files");
                        System.out.print("Enter the path and file names:");
                        String way = str.nextLine();
                        file = new ReadingFile(way);
                        break;
                    }
                    else{
                        file.countCharAz();
                        break;
                    }
            }
            if(userSelection == 3){
                System.out.println("Thank you for using the program =)");
                break;
            }
        }
    }
}
