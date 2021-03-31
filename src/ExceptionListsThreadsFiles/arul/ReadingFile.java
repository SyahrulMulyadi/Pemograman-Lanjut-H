package ExceptionListsThreadsFiles.arul;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadingFile {
    public static void main(String[] args) {
        class A {
            void Try throws FileNotFoundException {
                File f = new File("a.txt");
                Scanner sc = new Scanner(f);
                while (sc.hasNext()) {
                    String a = sc.next();
                    String b = sc.next();
                    System.out.println(a+ ""+b);
                }
                sc.close();
            }
        }
    }
}
