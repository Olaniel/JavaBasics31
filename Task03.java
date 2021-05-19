package by.epam.unit02.main;

public class Task03 {

    public static void main (String[] args) {

        int T = 9999;
        int T2 = 0;
        T2 = T;
        int HH, MM, SS;

        HH = T / 3600;
        T = T - HH * 3600;
        MM = T / 60;
        SS = T - MM * 60;

        System.out.println("В " + T2 + " секундах: " + HH + "ч "+ MM + "мин " + SS + "с.");
    }
}
