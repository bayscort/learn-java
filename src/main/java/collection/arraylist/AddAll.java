package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AddAll {
    public static void main(String[] args) {
        List<String> colors1 = new ArrayList<>();
        colors1.add("red");
        colors1.add("orange");
        colors1.add("yellow");

        List<String> colors2 = new ArrayList<>();
        colors2.add("green");
        colors2.add("blue");

        List<String> colors3 = new ArrayList<>();
        colors3.add("indigo");
        colors3.add("violet");

        colors3.addAll(colors1);
        colors3.addAll(0, colors2);

        System.out.println(colors3);
    }
}
