
public class YourFirstAccount {

    public static void main(String[] args) {
        
        Account miodragsAccount = new Account("Miodrag Simonovic", 100.0);
        
        miodragsAccount.deposit(20.0);
        
        System.out.println(miodragsAccount);
        
    }
}