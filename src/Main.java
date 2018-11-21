
public class Main {
    
    public static void main(String[] args) {
        
        Account account1 = new Account("Roberto Carlos", "1907fb", 5000); //to create user account
        ATM atm = new  ATM();
        atm.run(account1);
        
    }
}
