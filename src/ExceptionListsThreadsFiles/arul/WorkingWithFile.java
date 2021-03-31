package ExceptionListsThreadsFiles.arul;
import java.io.File;
public class WorkingWithFile {
    class A {
        public void main(String[] args) {
            File file = new File("a.txt");
            if(file.exists()) {
                System.out.println("Yes");
            }
        }
    }
}
