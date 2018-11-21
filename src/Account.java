
public class Account {
    
    private String user_name;
    private String password;
    private int ballance;

    public Account(String user_name, String password, int ballance) {
        this.user_name = user_name;
        this.password = password;
        this.ballance = ballance;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBallance() {
        return ballance;
    }

    public void setBallance(int ballance) {
        this.ballance = ballance;
    }
    
    public void addMoney(int amount) {
        
        ballance += amount;
        System.out.println("Actual ballance: " + ballance);   
    }
    
    public void drawingCash(int amount) {
        if ((ballance - amount) < 0) {
            
            System.out.println("You can't draw cash more than your " + ballance);
            
        }
        else {
            
            ballance -= amount;
            System.out.println("Acutal ballence: " + ballance);
            
        }
        
    }
    
    
}
