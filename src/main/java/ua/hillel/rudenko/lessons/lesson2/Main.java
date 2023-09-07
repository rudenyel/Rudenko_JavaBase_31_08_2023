package ua.hillel.rudenko.lessons.lesson2;

public class Main {
    public static void main(String[] args){
        double latitude = 50.089749641;
        double longitude = 14.3983984064;
        System.out.println("Latitude: " + latitude + " Longitude " + longitude);
        char symbol1 = '\u00B0';
        System.out.println("DMS latitude: 50" + symbol1 + " 05'23.10\" N   DMS latitude: 14" + symbol1 + "23'54.23\" E");
    }
}