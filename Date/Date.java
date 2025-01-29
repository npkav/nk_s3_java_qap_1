// Nickolas Kavanagh - SD12
// Semester 3 - Advanced Programming (Java)
// 2025/01/22 - 2025/01/30

// Problem 2: The Date Class

package Date;
public class Date {
    // initialize date details
    private int day;
    private int month;
    private int year;
    
    
    // initialize date details
    public Date(int day, int month, int year) {
        setDate(day, month, year);
    }
    
    
    // return date details
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }
    
    
    // set date details
    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }
    
    
    // set date details
    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    
    
    // return date details
    public String toString() {
        return String.format("The date is %02d/%02d/%04d", getDay(), getMonth(), getYear());
    }
}