// Nickolas Kavanagh - SD12
// Semester 3 - Advanced Programming (Java)
// 2025/01/22 - 2025/01/30

// Problem 1: The Account Class

package Account;
public class Account {
    private String id;
    private String name;
    private int balance = 0;
    
    
    // initialize account details
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
    // initialize account details w/ optional balance parameter
    public Account(String id, String name, int balance) {
        this(id, name);
        setBalance(balance);
    }
    
    
    // return account details
    public String getID() { return id; }
    public String getName() { return name; }
    public int getBalance() { return balance; }
    
    
    // set balance
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
    // add amount to balance
    public void credit(int amount) {
        setBalance(getBalance() + amount);
    }
    
    
    // subtract amount from balance
    public void debit(int amount) {
        if (amount <= getBalance()) {
            credit( - amount);
        } else {
            System.out.println("Error: Amount exceeded balance.");
        }
    }
    
    
    // transfer amount from balance to another account
    public void transferTo(Account other, int amount) {
        if (amount <= getBalance()) {
            debit(amount);
            other.credit(amount);
        } else {
            System.out.println("Error: Amount exceeded balance.");
        }
    }
    
    
    // return account details
    public String toString() {
        return String.format("Account ID: %s || Account Owner: %s || Account Balance: $%d", getID(), getName(), getBalance());
    }
}