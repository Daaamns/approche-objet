package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date dateDuJour = new Date();
        SimpleDateFormat formatJourMoisAnnee = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date du jour : " + formatJourMoisAnnee.format(dateDuJour));

        Calendar cal = Calendar.getInstance();
        cal.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date dateSpecific = cal.getTime();
        SimpleDateFormat formatComplet = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date spécifique : " + formatComplet.format(dateSpecific));

        Date dateSysteme = new Date();
        System.out.println("Date système : " + formatComplet.format(dateSysteme));    }
}
