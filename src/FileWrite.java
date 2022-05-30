import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("c:\\temp\\test_out.txt");
        //FileWriter fileWriter = new FileWriter(file);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.write("Hello\n");
        bw.write("Witamy\r\n");
        bw.close();
        fileWriter.close();
    }
}
