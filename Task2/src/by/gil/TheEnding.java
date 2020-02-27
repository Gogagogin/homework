package by.gil;

public class TheEnding {

    //Hear I create class, which working with endings of words
    //Yes, I know, it’s very big and not very effective
    //but at this moment I don’t have any idea’s, how to make better solution.


    public static char TheEndingOfSec(int seconds) {
        int a = seconds % 10;

        char endingOfSeconds = 'a';

        if (seconds == 1) {
            endingOfSeconds = 'a';
        }
        if (seconds > 1 && seconds <= 4) {
            endingOfSeconds = 'ы';
        }
        if (seconds > 5 && seconds <= 20 || seconds == 0) {
            endingOfSeconds = ' ';
        }
        if (seconds > 20) {

            if (a == 1) {
                endingOfSeconds = 'a';
            }
            if (a > 1 && a <= 4) {
                endingOfSeconds = 'ы';
            }
            if (a > 5 && a <= 9) {
                endingOfSeconds = ' ';
            }
        }

        return endingOfSeconds;

    }

    public static String TheEndingOfMin(int minutes, int hours, int days, int weeks) {
        int a = minutes % 10;

        String endingOfMinutes = null;

        if (minutes == 1) {
            endingOfMinutes = minutes + " минуты ";
        }
        if (minutes > 1 && minutes <= 4) {
            endingOfMinutes = minutes + " минуты ";
        }
        if (minutes > 5 && minutes <= 20 || minutes == 0) {
            endingOfMinutes = minutes + " минут ";
        }
        if (minutes > 20) {

            if (a == 1) {
                endingOfMinutes = minutes + " минутa ";
            }
            if (a > 1 && a <= 4) {
                endingOfMinutes = minutes + " минуты ";
            }
            if (a > 5 && a <= 9) {
                endingOfMinutes = minutes + " минут ";
            }
        }
        if (minutes == 0 && weeks == 0 && days == 0 && hours == 0) {
            endingOfMinutes = " ";
        }

        return endingOfMinutes;

    }

    public static String TheEndingOfHOurs(int hours, int days, int weeks) {
        int a = hours % 10;

        String endingOfHours = null;

        if (hours == 1) {
            endingOfHours = hours + " час ";
        }
        if (hours > 1 && hours <= 4) {
            endingOfHours = hours + " часа ";
        }
        if (hours > 5 && hours <= 20 || hours == 0) {
            endingOfHours = hours + " часов ";
        }
        if (hours > 20) {

            if (a == 1) {
                endingOfHours = hours + " час ";
            }
            if (a > 1 && a <= 4) {
                endingOfHours = hours + " часа ";
            }

        }
        if (weeks == 0 && days == 0 && hours == 0) {
            endingOfHours = "";
        }
        return endingOfHours;
    }

    public static String TheEndingOfDays(int days, int weeks) {

        String endingOfDays = null;

        if (days == 1) {
            endingOfDays = days + " день ";
        }
        if (days > 1 && days <= 4) {
            endingOfDays = days + " дня ";
        }
        if (days > 5 && days <= 7 || days == 0) {
            endingOfDays = days + " дней ";
        }
        if (weeks == 0 && days == 0) {
            endingOfDays = "";
        }

        return endingOfDays;
    }

    public static String TheEndingOfWeeks(int weeks) {
        int a = weeks % 10;


        String endingOfWeeks = null;

        if (weeks == 0) {
            endingOfWeeks = "";
        }

        if (weeks == 1) {
            endingOfWeeks = weeks + " неделя ";
        }
        if (weeks > 1 && weeks <= 4) {
            endingOfWeeks = weeks + " недели ";
        }
        if (weeks > 5 && weeks <= 20) {
            endingOfWeeks = weeks + " недель ";
        }
        if (weeks > 20) {

            if (a == 1) {
                endingOfWeeks = weeks + " неделя ";
            }
            if (a > 1 && a <= 4) {
                endingOfWeeks = weeks + " недели ";
            }
            if (a > 5 && a <= 9 || a == 0) {
                endingOfWeeks = weeks + " недель ";
            }
        }

        return endingOfWeeks;
    }
}
