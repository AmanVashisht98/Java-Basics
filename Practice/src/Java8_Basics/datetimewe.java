package Java8_Basics;

import java.time.LocalDateTime;

public class datetimewe {



    public static void main(String[] args) {
//        Date d=new Date();
//        System.out.println(d);
//
//        Calendar.getInstance();

        /**
         * LocalDate
         * LocalTime
         * LocalDateAndTime
         */

        //LocalDate
//       LocalDate d1= LocalDate.now();
//        System.out.println(d1);
//      d1=  d1.plusDays(10);
//      d1=d1.plusMonths(2);
//        System.out.println(d1);

//        LocalTime t= LocalTime.now();
//        System.out.println(t);
//
//       t= t.minusMinutes(10);
//        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        dt=dt.plusWeeks(2);
        System.out.println(dt);

        String s="2024-09-15T16:12:16.837078600";

        LocalDateTime ldt=LocalDateTime.parse(s);
        System.out.println(ldt);




    }

}
