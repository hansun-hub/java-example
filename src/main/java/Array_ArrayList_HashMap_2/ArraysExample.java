package Array_ArrayList_HashMap_2;

public class ArraysExample {

    public static void main(String[] args){

        int[] num = {1,2,3,4,5};
        String[] name={"가나다","sin","chang"};

        System.out.println(num[0]);
        System.out.println(name[0]);

        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
        name[0]="lee";
        System.out.println(name[0]);
        System.out.println(name);
    }
}
