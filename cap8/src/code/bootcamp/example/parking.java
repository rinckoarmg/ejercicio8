package code.bootcamp.example;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.time.temporal.ChronoUnit.*;

public class parking {
    public static double amountToPay(){
        int hourS;
        int minS;
        int hourE;
        int minE;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese hora de entrada");
        hourS = leer.nextInt();
        System.out.println("Ingrese minuto de entrada");
        minS = leer.nextInt();
        System.out.println("Ingrese hora de salida");
        hourE = leer.nextInt();
        System.out.println("Ingrese hora de salida");
        minE = leer.nextInt();
        var time = totalTime( hourS, minS, hourE, minE );
        var amount = time * 7.0;
        if ( amount > 40.0 ){
            return 40.0;
        } else {
            return amount;
        }
    }

    public static double totalTime( int hourStart, int minStart, int hourEnd, int minEnd ){
        LocalTime start = LocalTime.of(hourStart, minStart);
        LocalTime end = LocalTime.of(hourEnd,minEnd);
        double duration = start.until(end, MINUTES);
        double durationHours = duration/60;
        System.out.println("Total hours: " + ceil(durationHours));
        return ceil(durationHours);

    }


}
