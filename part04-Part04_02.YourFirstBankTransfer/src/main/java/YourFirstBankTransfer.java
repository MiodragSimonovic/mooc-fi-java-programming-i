
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        
        Account matthewssAccount = new Account("Matthews account", 1_000);
        Account myAccount = new Account("My account", 0);
        
        matthewssAccount.withdrawal(100);
        myAccount.deposit(100);
        
        System.out.println(matthewssAccount);
        System.out.println(myAccount);
        
    }
    
}
