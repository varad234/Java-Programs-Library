import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("example.txt");
        writer.write("Hello, Java File I/O!");
        writer.close();

        FileReader reader = new FileReader("example.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }
}
