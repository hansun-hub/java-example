public class SavingAccount extends BankAccount implements Withdrawable{

    //마이너스 통장 여부
    boolean isOverdraft;

    //계좌 송금 메서드
    void transfer() {}

    void deposit(){
        // 재정의 (부모 클래스의 함수와 관계없이 자식 클래스의 함수로 덮어씌워진다.)
    }

    public void withdraw(){
        System.out.println("Withdraw");
    }
}
