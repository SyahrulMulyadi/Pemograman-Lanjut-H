package ExceptionListsThreadsFiles.arul;
import java.util.HashMap;
public class HasMap1 {
    class A {
        public void main(String[] args) {
            HashMap<String,String> m = new HashMap<String,String>();
            m.put("A","First");
            m.put("B","Second");
            m.put("C","Thrid");
            System.out.println(m.get("B"));
        }
    }
}
