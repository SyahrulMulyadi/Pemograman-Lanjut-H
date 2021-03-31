package ExceptionListsThreadsFiles.arul;
import java.util.ArrayList;
import java.util.Iterator;
public class ModuleQuiz6Bag3 {
    public static void main(String[] args) {
        class A<x> {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0 ; < 6 ; i++) {
                list.add(i);
            }
            int x = 0;
            Iterator<Integer> it = list.iterator();
            while (it.hasNext());
            x + = it.next();
        }
        System.out.println(x);
    }
}