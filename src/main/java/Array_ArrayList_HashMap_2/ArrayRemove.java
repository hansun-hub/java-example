package Array_ArrayList_HashMap_2;

import java.io.IOException;
import java.util.ArrayList;

public class ArrayRemove {
    public static void main(String args[])throws IOException{
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        arrList.add("D");
        arrList.add("D");
        System.out.println(arrList);

        //1번째 element 값 삭제하기
        arrList.remove(1);
        System.out.println(arrList);

        //전체 삭제
        arrList.clear();
        System.out.println(arrList);
    }
}
