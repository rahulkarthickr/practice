import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) throws IOException {
        File fold = new File("C:\\Personal\\Sample");
        fold.mkdir();
        File file = new File("C:\\Personal\\Sample\\Sample.txt");
        file.createNewFile();
        try (FileReader reader = new FileReader("C:\\Personal\\Sample\\Sample.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.println((char) ch);
            }
        }
    }
}
