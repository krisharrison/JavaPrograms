import java.util.Scanner;

public class FirstDaysOfMonth {
    public static void main(String[] args){


       Scanner input = new Scanner(System.in);

       System.out.print("Please enter a year: ");
       int year = input.nextInt();

       int day = 1;
       System.out.print("\nPlease enter a day: ");
       String dayOfWeek = input.next();

       if(dayOfWeek.toUpperCase().equals("MONDAY")){
           day = 1;
       }
       else if(dayOfWeek.toUpperCase().equals("TUESDAY")){
           day = 2;
       }
       else if(dayOfWeek.toUpperCase().equals("WEDNESDAY")){
           day = 3;
       }
       else if(dayOfWeek.toUpperCase().equals("THURSDAY")){
           day = 4;
       }
       else if(dayOfWeek.toUpperCase().equals("FRIDAY")){
           day = 5;
       }
       else if(dayOfWeek.toUpperCase().equals("SATURDAY")){
           day = 6;
       }
       else if(dayOfWeek.toUpperCase().equals("SUNDAY")){
           day = 7;
       }

       displayDay(year,day);
    }
    public static void displayDay(int year, int day){
        int dayOfWeek = day;
        int numOfDaysLeapYear = 366;
        int numOfDaysYear= 365;
        String month = " ";
        String weekDay = " ";
        int dayCount = 1;



        if(!isLeapYear(year)) {
            while(dayCount <= numOfDaysYear){

                if(dayOfWeek == 1){
                    weekDay = "Monday";
                }
                else if(dayOfWeek == 2){
                    weekDay = "Tuesday";
                }
                else if(dayOfWeek == 3){
                    weekDay = "Wednesday";
                }
                else if(dayOfWeek == 4){
                    weekDay = "Thursday";
                }
                else if(dayOfWeek == 5){
                    weekDay = "Friday";
                }
                else if(dayOfWeek == 6){
                    weekDay = "Saturday";
                }
                else if(dayOfWeek == 7){
                    weekDay = "Sunday";
                }

                while(true) {
                    if (dayCount == 1) {
                        month = "January 1, " + year + " is a ";
                        System.out.print("\n\n" + month + weekDay);
                    } else if (dayCount == 32) {
                        month = "February 1, " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 60) {
                        month = "March 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 91) {
                        month = "April 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 121) {
                        month = "May 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 152) {
                        month = "June 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 182) {
                        month = "July 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 213) {
                        month = "August 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 244) {
                        month = "September 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 274) {
                        month = "October 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 305) {
                        month = "November 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 335) {
                        month = "December 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay + "\n");
                    }
                    break;
                }

                day++;
                dayOfWeek = (day > 7) ? day = 1 : day;
                dayCount++;
            }
        }
        else{
            while(dayCount <= numOfDaysLeapYear){

                if(dayOfWeek == 1){
                    weekDay = "Monday";
                }
                else if(dayOfWeek == 2){
                    weekDay = "Tuesday";
                }
                else if(dayOfWeek == 3){
                    weekDay = "Wednesday";
                }
                else if(dayOfWeek == 4){
                    weekDay = "Thursday";
                }
                else if(dayOfWeek == 5){
                    weekDay = "Friday";
                }
                else if(dayOfWeek == 6){
                    weekDay = "Saturday";
                }
                else if(dayOfWeek == 7){
                    weekDay = "Sunday";
                }

                while(true) {
                    if (dayCount == 1) {
                        month = "January 1, " + year + " is a ";
                        System.out.print("\n\n" + month + weekDay);
                    } else if (dayCount == 32) {
                        month = "February 1, " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 61) {
                        month = "March 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 92) {
                        month = "April 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 122) {
                        month = "May 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 153) {
                        month = "June 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 183) {
                        month = "July 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 214) {
                        month = "August 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 245) {
                        month = "September 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 275) {
                        month = "October 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 306) {
                        month = "November 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay);
                    } else if (dayCount == 336) {
                        month = "December 1 " + year + " is a ";
                        System.out.print("\n" + month + weekDay + "\n");
                    }
                    break;
                }

                day++;
                dayOfWeek = (day > 7) ? day = 1 : day;
                dayCount++;
            }
        }




    }
    public static boolean isLeapYear(int year){
        boolean isLeapYear = false;

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeapYear = true;
        }

        return isLeapYear;
    }
}
