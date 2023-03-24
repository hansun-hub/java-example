package Array_ArrayList_HashMap_2;

import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args){
        /*ArrayList list = new ArrayList(5);
        list.add(30);
        list.add("chai");
        list.add("whang");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }*/

        ArrayList<String> name = new ArrayList(5);

        name.add("chai");
        name.add("hong");

        for(int i=0;i<name.size();i++){
            System.out.println(name.get(i));
        }
    }

}
