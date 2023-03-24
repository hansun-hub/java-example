package Array_ArrayList_HashMap_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"cool","fun","sexy","lion"};

        System.out.print("수정할 별명을 입력하세요 > ");
        String name = br.readLine();

        for(int i=0;i<arr.length;i++){
            if(name.equals(arr[i])){
                System.out.print("변경할 이름을 작성해주세요 > ");
                String N = br.readLine();
                arr[i]=N;
            }
        }

        System.out.println("이름이 변경되었습니다.");
        System.out.println(Arrays.toString(arr));
    }
}
