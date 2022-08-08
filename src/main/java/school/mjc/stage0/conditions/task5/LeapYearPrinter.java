package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println("leap");
        }
        // not a leap year if divisible by 100
        // but not divisible by 400
        else if (year % 100 == 0) {
            System.out.println("not leap");
        }
        // leap year if not divisible by 100
        // but divisible by 4
        else if (year % 4 == 0) {
            System.out.println("leap");
        }
        // all other years are not leap years
        else {
            System.out.println("not leap");
        }
    }
}
