package ExceptionListsThreadsFiles.arul;
import java.util.HashMap;
public class HasMap2 {
    class A {
        public void main(String[] args) {
            HashMap<String, String> m = new HashMap<String, String>();
            m.put("A","First");
            m.put("A","Second");

            System.out.println(m.get("B"));
        }
    }
}