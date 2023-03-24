package Array_ArrayList_HashMap_2;

import java.util.HashMap;

public class MapExample {

    public static void main(String args[])

    {
        HashMap<String, String> map = new HashMap();
        map.put("name", "chang");
        map.put("mbti", "ENTP");

        System.out.println(map.entrySet());
        System.out.println(map.get("mbti"));
    }
}
