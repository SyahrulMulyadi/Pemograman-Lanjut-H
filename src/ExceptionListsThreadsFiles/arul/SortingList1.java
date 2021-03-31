package ExceptionListsThreadsFiles.arul;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingList1 {
    class A {
        public void main(String[] args) {
            List<String> list = new ArrayList<String>();
            list.add("b");
            list.add("a");
            list.add("c");
            Collections.sort(list);
            System.out.println(list.get(0));
        }
    }
}
