public class CurrentNumber {
    private static int  currencyID = 0;
    Account account = new Account();
    DateClass startDate = new DateClass();
    private int accountId = currencyID++;
    private int customerId;

    public CurrentNumber(int customerId ){
    this.customerId = customerId;
    }
    public void addBalance(double money){
        account.addBalance( money);
    }

    public void subBalance(double money){
        if(money > account.getBalance()){
            throw new RuntimeException("There is not enough money in the account");
        }
        account.subBalance(money);
    }
}
