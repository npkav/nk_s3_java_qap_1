// Nickolas Kavanagh - SD12
// Semester 3 - Advanced Programming (Java)
// 2025/01/22 - 2025/01/30

// Problem 3: The Time Class

package Time;
public class Time {
    // initialize time details
    private int hour;
    private int minute;
    private int second;
    
    
    // initialize time details
    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }
    
    
    // return time details
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }
    
    
    // set time details
    public void setHour(int hour) { this.hour = hour; }
    public void setMinute(int minute) { this.minute = minute; }
    public void setSecond(int second) { this.second = second; }
    
    
    // set time details
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    
    
    // return time details
    public String toString() {
        return String.format("The time is %02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    
    
    // advance time by 1 second
    public void nextSecond() {
        setSecond(getSecond() + 1);
    }
    
    
    // go back time by 1 second
    public void previousSecond() {
        setSecond(getSecond() - 1);
    }
}