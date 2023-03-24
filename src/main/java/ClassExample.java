public class ClassExample {
    public static void main(String args[]){
        BankAccount bankAccount = new BankAccount();
        bankAccount.changePassword(12345);
        System.out.println(bankAccount.getPassword());
    }
}
