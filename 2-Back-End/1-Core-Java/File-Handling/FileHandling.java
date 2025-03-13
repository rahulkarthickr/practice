import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        // Folder Creation
        File fold = new File("C:\\Personal\\Sample");
        fold.mkdir();
        // File Creation
        File file = new File("C:\\Personal\\Sample\\Sample.txt");
        file.createNewFile();
        // File Writing
        FileWriter fw = new FileWriter("C:\\Personal\\Sample\\Sample.txt");
        fw.write("Hello, You are right now seeing the content created using FileWriter class");
        fw.close();
        // File Reading Using Scanner
        Scanner sc = new Scanner("C:\\Personal\\Sample\\Sample.txt");
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
        // File Reading Using FileReader
        FileReader fr = new FileReader("C:\\Personal\\Sample\\Sample.txt");
        int read;
        while ((read = fr.read()) != -1) {
            char b = (char) read;
            System.out.println(b);
        }
        fr.close();
        // Methods in File Handling
        System.out.println(file.exists());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.delete());
    }
}