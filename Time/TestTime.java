package Time;
public class TestTime {
    public static void main(String[] args) {
        // initialize time
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);
        
        // print starting times
        System.out.println("Starting times:");
        System.out.println("Time 1: " + t1.toString());
        System.out.println("Time 2: " + t2.toString());
        
        // advance time by 1 second
        t1.nextSecond();
        t2.previousSecond();
        
        // print modified times
        System.out.println("\nModified times:");
        System.out.println("Time 1: " + t1.toString());
        System.out.println("Time 2: " + t2.toString());
    }
}
