import java.util.Scanner;

public class DayOfMonth {
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String strYear;
        int year;
        String month;

        do {
            System.out.print("Please enter a year: ");
            strYear = keyboard.nextLine();

            if (strYear.matches("\\d+")) {
                year = Integer.parseInt(strYear); 

                if (year >= 0) {
                    break;  
                }
            }
            System.out.println("Year invalid! Please enter again.");
        } while (true);
        do {
            System.out.print("Please enter a month: ");
            month = keyboard.nextLine();
            if(month.equals("January") || month.equals("Jan") || month.equals("Jan.") || month.equals( "1")){
                System.out.println("January, " + year + " has 31 days");
                break;
            } else if (month.equals("February") || month.equals("Feb") || month.equals("Feb.") || month.equals( "2")){
                if(isLeapYear(year)){
                    System.out.println("February, " + year + " has 29 days");
                    break;
                } else {
                    System.out.println("February, " + year + " has 28 days");
                    break;
                }
            } else if (month.equals( "March") || month.equals( "Mar") || month.equals( "Mar.") || month.equals( "3")){
                System.out.println("March, " + year + " has 31 days");
                break;
            } else if (month.equals( "April") || month.equals( "Apr") || month.equals( "Apr.") || month.equals( "4")){
                System.out.println("April, " + year + " has 30 days");
                break;
            } else if (month.equals( "May") || month.equals( "5")){
                System.out.println("May, " + year + " has 31 days");
                break;
            } else if (month.equals( "June") || month.equals( "Jun") || month.equals( "6")){
                System.out.println("June, " + year + " has 30 days");
                break;
            } else if (month.equals( "July") || month.equals( "Jul") || month.equals( "7")){
                System.out.println("July, " + year + " has 31 days");
                break;
            } else if (month.equals( "August") || month.equals( "Aug") || month.equals( "Aug.") || month.equals( "8")){
                System.out.println("August, " + year + " has 31 days");
                break;
            } else if (month.equals( "September") || month.equals( "Sep") || month.equals( "Sept.") || month.equals( "9")){
                System.out.println("September, " + year + " has 30 days");
                break;
            } else if (month.equals( "October") || month.equals( "Oct") || month.equals( "Oct.") || month.equals( "10")){
                System.out.println("October, " + year + " has 31 days");
                break;
            } else if (month.equals( "November") || month.equals( "Nov") || month.equals( "Nov.") || month.equals( "11")){
                System.out.println("November, " + year + " has 30 days");
                break;
            } else if (month.equals( "December") || month.equals( "Dec") || month.equals( "Dec.") || month.equals( "12")){
                System.out.println("December, " + year + " has 31 days");
                break;
            } else {
                System.out.println("Invalid month! Please enter again");
            }
        } while (true);

        keyboard.close();
    }
}

