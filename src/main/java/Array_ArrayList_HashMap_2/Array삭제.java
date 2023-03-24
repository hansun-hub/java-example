package Array_ArrayList_HashMap_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array삭제 {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"cool","fun","sexy","lion"};
        System.out.print("삭제할 별명을 입력하세요 > ");

        String name = br.readLine();

        int count = arr.length;

        for(int i=0;i<count;i++){

            if(name.equals(arr[i])){
                System.out.println(name+"을 삭제합니다.");

                //뒤에 인덱스를 하나씩 당겨오기
                for(int j=i;j<count-1;j++){
                    arr[j]=arr[j+1];
                }
                count--;
                break;
            }
        }for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
