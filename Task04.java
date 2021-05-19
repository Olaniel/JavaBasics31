package by.epam.unit02.main;

public class Task04 {

    public static void main (String[] args) {

        double x1 = 1;
        double y1 = 3;
        double x2 = 5;
        double y2 = 8;

        double x = x2 - x1;
        double y = y2 - y1;

        double z = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));

        System.out.println("Расстояние =" + z + ".");
    }
}
