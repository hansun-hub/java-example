import java.util.ArrayList;

public class ExceptionExample {

    public static void main(String[] args){
        //
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        }catch (IndexOutOfBoundsException ioe){
            System.out.println("IndexOutOfBoundsException 에러 발생");
        }catch (IllegalArgumentException iae){
            System.out.println("IllegalArgumentException 에러 발생");
        }catch (Exception e){
            System.out.println("최상위 에러 처리");
        }
        finally {
            System.out.println("Finally");
            System.out.println(" ");
        }

        //
        ArrayList arrayList = new ArrayList(3);
        try{
            arrayList.get(10);
        }catch (Exception e){
//            e.printStackTrace(); //에러의 내용을 실제로 확인하고 싶을 때 사용
            System.out.println("에러 발생");//시스템 보안 상 catch 문에 출력문 추천 X
        }finally {
            System.out.println("Finally");
            System.out.println(" ");
        }


        //
        String str = null;
        try {
            System.out.println(str.toString());
        }catch (Exception e){
            System.out.println("에러발생");
        }finally {
            System.out.println("Finally");
            System.out.println(" ");
        }

    }
}
