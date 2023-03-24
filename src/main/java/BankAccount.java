public class BankAccount {

    //은행 코드
    int bankCode;

    //계좌 번호
    int accountNo;

    //소유주
    String owner;

    //잔액
    int balance;

    //휴면 여부
    boolean isDormant;

    //비밀번호
    private int password;

    //조회
    void inquiry(){}

    //입금
    void deposit() {}

    //출금
    void withdraw() {}

    //휴먼 계좌 전화 로직
    void heldInDormant(){}

    BankAccount(){

    }

    BankAccount(
            int bankCode,
            int accountNo,
            String owner,
            int balance,
            boolean isDormant,
            int password
    ){
        this.bankCode = bankCode;
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
        this.isDormant = isDormant;
        this.password = password;
    }

    //비밀번호 변경
    public void changePassword(int password){
        this.password = password;
    }

    //비밀번호 조회
    public int getPassword(){
        return password;
    }

    public int getBankCode() {
        return bankCode;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isDormant() {
        return isDormant;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setDormant(boolean dormant) {
        isDormant = dormant;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
