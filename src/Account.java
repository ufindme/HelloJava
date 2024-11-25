/**
*  简单JAVA类
*/
public class Account{
    private String accountNo;
    private String name;
    private double balance;
    
    public Account(){}
    
    public Account(String accountNO, String name, double balance){
        setAccountNo(accountNO);
        setName(name);
        setBalance(balance);
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    
    public String getAccountNo(){
        return this.accountNo;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public static void main(String[] args){
        Account myAccount = new Account("10010", "张三", 50000.0);
        System.out.println(myAccount.getName() + "的账户余额是" + myAccount.getBalance());
    }
    
}