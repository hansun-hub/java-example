package Array_ArrayList_HashMap_2;

import java.io.IOException;
import java.util.ArrayList;

public class ArrayListSet {
    public static void main(String args[])throws IOException {

        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        System.out.println(arrList);

        arrList.set(1,"b");
        System.out.println(arrList);
    }
}
