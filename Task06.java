package by.epam.unit02.main;

public class Task06 {

    public static void main (String [] args) {

        int M = 1000;
        int N = 37;

        double A = (double) M / N;
        int B = (int) (A % 10);
        int C = (int) (A * 10 % 10);

        System.out.println("Число M/N = " + A + ". Старшая цифра дробной части - " + C + ", младшая фицра целой части - " + B + ".");
    }
}
