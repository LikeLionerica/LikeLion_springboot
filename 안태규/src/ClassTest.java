public class ClassTest {

    static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.setBankCode(30);
        System.out.println(account.getBankCode());
        account.changePassword(123456);
        System.out.println(account.getPassword());
    }
}
