package com.realprograms.j8features;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

@FunctionalInterface
interface Square {
    int calculate(int x);
}


public class Integration {

    int v = 6;
    public void sampleMethod(){
        Square  sqb = (int a) -> (a*a);

        int res = sqb.calculate(v);

        System.out.println("The value getting integer after calling fun inteface -> "+res);
    }

    public void dateAndTimeApiExample(){

        LocalDate ld = LocalDate.now();
        System.out.println("The local date required "+ld);

        LocalTime lt = LocalTime.now();
        System.out.println("The local date required "+lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("The local date required "+ldt);

        Month month = ldt.getMonth();
        int mins = ldt.getMinute();
        System.out.println("The month in date and mins required "+month + "mins .. " +mins);

    }
}
