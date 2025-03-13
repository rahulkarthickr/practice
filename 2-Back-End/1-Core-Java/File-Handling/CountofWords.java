import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountofWords {
    public static void main(String[] args) throws IOException {
        File fold = new File("C:\\Personal\\Dummy");
        fold.mkdir();
        File file = new File("C:\\Personal\\Dummy\\Dummy.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter("C:\\Personal\\Dummy\\Dummy.txt");
        fw.write("Hello, You are seeing content creeated using FileReader");
        fw.close();
        FileReader fr = new FileReader("C:\\Personal\\Dummy\\Dummy.txt");
        int c;
        int count = 0;
        boolean isPrevSpace = true;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == ' ') {
                isPrevSpace = true;
            } else {
                if (isPrevSpace) {
                    count++;
                }
                isPrevSpace = false;
            }
        }
        fr.close();
        System.out.println("Count of number of words in the file:" + count);
    }
}
