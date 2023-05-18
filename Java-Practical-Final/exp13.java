// Defines an int enum and then a variable called monthNumber and assigns it a value between 1 and 12, inclusive. Uses a switch statement to print the name of the month corresponding to the value of monthNumber.
public class exp13 {
    public enum Month {
        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
        APRIL(4),
        MAY(5),
        JUNE(6),
        JULY(7),
        AUGUST(8),
        SEPTEMBER(9),
        OCTOBER(10),
        NOVEMBER(11),
        DECEMBER(12);

        private int monthNumber;

        private Month(int monthNumber) {
            this.monthNumber = monthNumber;
        }

        public int getMonthNumber() {
            return monthNumber;
        }
    }

    public static void main(String[] args) {
        int monthNumber = 8; // change this value to test different months

        String monthName;
        switch (monthNumber) {
            case 1:
                monthName = Month.JANUARY.name();
                break;
            case 2:
                monthName = Month.FEBRUARY.name();
                break;
            case 3:
                monthName = Month.MARCH.name();
                break;
            case 4:
                monthName = Month.APRIL.name();
                break;
            case 5:
                monthName = Month.MAY.name();
                break;
            case 6:
                monthName = Month.JUNE.name();
                break;
            case 7:
                monthName = Month.JULY.name();
                break;
            case 8:
                monthName = Month.AUGUST.name();
                break;
            case 9:
                monthName = Month.SEPTEMBER.name();
                break;
            case 10:
                monthName = Month.OCTOBER.name();
                break;
            case 11:
                monthName = Month.NOVEMBER.name();
                break;
            case 12:
                monthName = Month.DECEMBER.name();
                break;
            default:
                monthName = "Invalid month number";
                break;
        }

        System.out.println("Month name for month number " + monthNumber + ": " + monthName);
    }
}
