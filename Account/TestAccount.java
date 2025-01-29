package Account;
public class TestAccount {
    public static void main(String[] args) {
        // initialize accounts
        Account acc1 = new Account("0118999881999119725", "Maurice Moss", 5000);
        Account acc2 = new Account("0000000000000000003", "Jen Barber", 4000);
        
        
        // print starting balances
        System.out.println("Starting balances:");
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        
        
        // transfer funds from acc1 to acc2
        acc1.transferTo(acc2, 1000);
        
        
        // print post-transfer balances
        System.out.println("\nPost-transfer balances:");
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
    }
}