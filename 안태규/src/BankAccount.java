public class BankAccount {

    private int bankCode;
    private int accountNo;
    private String owner;
    private int balance;
    private boolean isDormant;
    private int password;

    public void inquiry() {}
    public void deposit() {}
    public void withdraw() {}
    public void heldInDormant() {}
    public void setBankCode (int bc) {
        this.bankCode = bc;
    }
    public int getBankCode (){
        return this.bankCode;
    }
    public void changePassword (int pw){
        this.password = pw;
    }
    public int getPassword (){
        return this.password;
    }

    public boolean isDormant() {
        return isDormant;
    }

    public void setDormant(boolean dormant) {
        isDormant = dormant;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    BankAccount() {
    }

    BankAccount(
            int bankCode,
            int accountNo,
            String owner,
            int balance,
            boolean isDormant,
            int password
    ) {
        this.bankCode = bankCode;
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
        this.isDormant = isDormant;
        this.password = password;

    }

}
