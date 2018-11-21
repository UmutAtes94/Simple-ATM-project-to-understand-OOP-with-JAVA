
import java.util.Scanner;


public class ATM { //bütün işlemler burda gerçekleşecek
    
    public void run(Account account) {
        Login login = new Login(); //control to login
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("............\\\\__WELCOME__////...............");
        System.out.println("******************************");
        System.out.println("User Login");
        System.out.println("******************************");
        
        int count = 3;
        
        while(true) {
            if (login.login(account)) { //if login process true
                System.out.println("Login successful");
                break;
            }
            else {
                System.out.println("Login Failed");
                count--;
                System.out.println(count + "attempts to remaining");
            }
            if (count == 0) {
                System.out.println(" Sorry.. You don't have enough attemps remaining to LOGIN");
                return; //to finish run() method...
            }
        }
        
        System.out.println("**********************************");
        String Transactions = "1. Display the balance\n"
                        + "2. Add money in your bank account \n"
                        + "3. withdraw money from your bank account\n"
                        + "Press 'q' to QUIT ...." ;
        System.out.println(Transactions);
        System.out.println("**********************************");
        
        while (true) {
            System.out.println("Please select your transaction ");
            String transaction = scanner.nextLine();
            if (transaction.equals("q")) {
                break;
            }
            else if (transaction.equals("1")) {
                System.out.println("Ballance: " + account.getBallance());
                
            }
            else if (transaction.equals("2")) {
                System.out.println("How much do you want to deposit: ");
                int amount = scanner.nextInt();
                scanner.nextLine();//dummy
                account.addMoney(amount);
                
            }
            else if (transaction.equals("3")) {
                System.out.println("Enter the amount you want to withdraw:");
                int amount = scanner.nextInt();
                scanner.nextLine();//dummy
                account.drawingCash(amount);
            }
            else {
                System.out.println("Invalid transaction");
            }
            
        }
        
    }
    
}
