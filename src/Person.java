import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/12/2019
 */

public class Person{
    // TODO Ret nedenstående datatyper
    String navn; // Test Testesen
    short alder; // 18
    String by; // Næstved
    short postNummer; // 4700
    String vej; // Femøvej
    String husnummer; // 3B
    String nationalitet; // Dansk
    ArrayList<String>fritidsStringeresser=new ArrayList<>(); // Snitning, LOL, strikke
    ArrayList<String>smarthomeDevices=new ArrayList<>(); // Xbox, 3 Smartlamper, Køleskab m.m.
    double hojde; // 1.56 m
    double vaegt; // 76 kg
    double karaktergennemsnit; // 5.33
    double eksamensKarakterer; // 7, 12, -3, 4, 2, 10
    Date opdateretDato; // Sun Jan 08 00:00:00 CET 1978

    // TODO Vis eksempler på typecasting
    public Date stringToDate(String string)throws ParseException{
        //The below typecasting is one of the most common typecasting as the transferring
        //of the date and/or time between systems happens in Strings e.g. two servers sending data between each other.
        opdateretDato=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").parse(string);
        return opdateretDato;
    }

    @Override
    public String toString(){
        return"Navn: "+navn+" By: "+by;
    }

    public static void main(String[] args)throws ParseException{
        Person person=new Person();
        person.navn="Test Testesen";
        person.by="Næstved";
        System.out.println(person.toString());

        System.out.println(person.stringToDate("2019/12/31 23:59:59"));
    }
}