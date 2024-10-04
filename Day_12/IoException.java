import java.io.File;
import java.io.FileReader;

public class IoException {
    public static void main(String[] args) {
        try {
            File file = new File("nonexist.txt");
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            System.out.println("Check the exception" + e.getMessage());

        }
        //int result = 10/0;
    }
}
