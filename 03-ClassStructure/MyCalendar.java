public class MyCalendar {

    static String months(int a) {
        switch (a) {
            case 1:
                return "January";
        
            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "Juni";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";
            
            default:
            return "Incorrect value";
        }

    }

    static int days(int a) {
        int[] MonthLengths = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
        int PassedDays = 0;
        for (int month = 0; month < a; month = month + 1) {
            PassedDays += MonthLengths[month];
        }
        
        return PassedDays; 
    }

    static int year;
    static int month;
    static int day;

    static String myDate() {
        return String.format("%04d-%02d-%02d", year,month,day);
    }


    public static void main(String[] args) {
        year = 2001;
        month = 9;
        day = 11;
        
        System.out.println(months(2));
        System.out.println(days(3));
        System.out.println(myDate());
    }
}