package by.gil;

import java.util.Scanner;

public class WhatIsTheTime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Hear I release method, which allows us to put a value from keyboard
        System.out.print("Input a number: ");
        String secondsValue = in.nextLine();

        TryCatch.isInt(secondsValue);
        if (TryCatch.isInt(secondsValue) == false) {
            System.out.println("ERROR, Input value is not Integer, please try again");
            System.exit(0);
        }
        int s = Integer.parseInt(secondsValue);

        if (s <= 0){ //Here I check, is the value positive or not
            System.out.println("ERROR, Input value is not positive");
            System.exit(0);
        }
        System.out.println("Your number:  " + secondsValue);
        in.close();

        int  m ,h,d,w;
        int  sec , min, hour, day, week ;
        sec = s % 60;
        m = (s- sec)/60;
        min = m % 60;
        h = (m-min)/60;
        hour = h%24;
        d = (h-hour)/24;
        day = d%7;
        w = (d-day)/7;
        week = w%7;

        System.out.println(
                TheEnding.TheEndingOfWeeks(week)
                        + TheEnding.TheEndingOfDays(day,week)
                        + TheEnding.TheEndingOfHOurs(hour,day,week)
                        + TheEnding.TheEndingOfMin(min,hour,day,week)
                        + sec  + " секунд" + TheEnding.TheEndingOfSec(sec));

    }
}