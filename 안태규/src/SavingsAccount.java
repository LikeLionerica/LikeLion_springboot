public class SavingsAccount extends BankAccount implements  Withdrawable {

    boolean isOverdraft;
    void transfer(){}

    //외부의 인터페이스 메소드 재정의 시 public 필수
    public void withdraw(){
        System.out.println("withdraw");
    }

}
