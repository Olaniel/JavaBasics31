package by.epam.unit02.main;

public class Task02 {

    public static void main (String[] args) {

        int x = 1;
        int y = 100;

        if (x < y) {
            y = x + y;
            x = y - x;
            y = y - x;
        }
        System.out.println("x = " + x + "; y = " + y);
    }
}
