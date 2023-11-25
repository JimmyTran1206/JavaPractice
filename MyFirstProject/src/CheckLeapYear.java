public class CheckLeapYear {
    public static void checkLeapYear(int year){
        // Leap year rule: the year is evenly divisible by 4. If the year is evenly divisible by 100, it is not a leap year, unless it is evenly divisible by 400.
        if((year % 400 == 0) || ((year % 4 == 0 ) && (year % 100 != 0))){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
    public static void main(String[] args) {
        int checkYear = 2024;
        checkLeapYear(checkYear);
    }
}
