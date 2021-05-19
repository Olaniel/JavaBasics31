package by.epam.unit02.main;

public class Task05 {

    public static void main (String [] args) {

        double x = 1.0;
        double y = 2.0;
        double z = 0;

        z = (((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y));

        System.out.println("Значение выражения Z = " + z + ".");
    }
}
