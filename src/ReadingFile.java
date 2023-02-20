public class ReadingFile {
    private String fileNameAndWay;

    ReadingFile(String fileNameAndWay) {
        while (!fileSearch(fileNameAndWay)) {
        }
        this.fileNameAndWay = fileNameAndWay;
    }

    private boolean fileSearch(String fileNameAndWay){
        System.out.println("tets");
        return true;
    }
}


