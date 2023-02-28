import java.io.IOException;
import java.util.Scanner;
//C:\tests\file1test.txt
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the path and file names:");
        String wayAndName = in.nextLine();
        ReadingFile file = new ReadingFile(wayAndName);
        file.countСharAz();


    }

}
