package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatJourMoisAnnee = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatComplet = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        calendar.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date dateSpecific = calendar.getTime();
        System.out.println("Date spécifique avec Calendar : " + formatJourMoisAnnee.format(dateSpecific));

        calendar = Calendar.getInstance();
        Date dateDuJour = calendar.getTime();
        System.out.println("Date du jour avec Calendar : " + formatComplet.format(dateDuJour));

        SimpleDateFormat formatFrancais = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRENCH);
        SimpleDateFormat formatRusse = new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("ru"));
        SimpleDateFormat formatChinois = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINESE);
        SimpleDateFormat formatAllemand = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.GERMAN);

        System.out.println("En Français : " + formatFrancais.format(dateDuJour));
        System.out.println("En Russe : " + formatRusse.format(dateDuJour));
        System.out.println("En Chinois : " + formatChinois.format(dateDuJour));
        System.out.println("En Allemand : " + formatAllemand.format(dateDuJour));
    }
}
