import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) {
        System.out.println("Hello");
        File file = new File("c:\\temp\\test.txt");
        System.out.println(file.length());
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.io.tmpdir"));

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                Integer ii = Integer.parseInt("5");
                Double dd = Double.parseDouble("5.933");
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
