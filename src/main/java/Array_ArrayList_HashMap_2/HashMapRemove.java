package Array_ArrayList_HashMap_2;

import java.util.HashMap;
public class HashMapRemove {
    public static void main(String args[]){

        //HashMap객체를 생성합니다.
        HashMap <String,String> hashmap = new HashMap <String, String>();

        /*
        1. remove - 특정 데이터 삭제 시 사용합니다. (삭제할 key 입력)
        2. replace - 득정 데이터를 수정시 사용합니다. (key, 수정할 value 입력)
         */

        hashmap.put("key1","value1");
        hashmap.put("key2","value2");
        hashmap.put("key3","value3");

        //삭제합니다.
        hashmap.remove("key2");
        System.out.println("삭제 목록 : "+hashmap.toString());

        //수정합니다.
        hashmap.replace("key3", "value33");
        System.out.println("수정 목록 : " +hashmap.toString());

    }


}
