import java.util.ArrayList;

public class ExceptionExample2 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;

            ArrayList arrayList = new ArrayList(3);
            arrayList.get(10);

            String str = null;
            System.out.println(str.toString());

        }
        catch (IndexOutOfBoundsException ioe){
            System.out.println("IndexOutOfBoundsException 에러 발생");
        }catch (ArithmeticException ae) {
            System.out.println("ArithmeticException 에러 발생");
        }catch (IllegalArgumentException iae){
            System.out.println("IllegalArgumentException 에러 발생");
        }catch (NullPointerException npe) {
            System.out.println("NullPointerException 에러 발생");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("에러발생");

        }finally {
            System.out.println("Finally");

        }
    }
}
