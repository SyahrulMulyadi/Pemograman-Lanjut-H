package ExceptionListsThreadsFiles.arul;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("orange");
        colors.remove("green");

        System.out.println(colors);
    }
}