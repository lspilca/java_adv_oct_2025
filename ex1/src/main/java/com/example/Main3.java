package com.example;

public class Main3 {

    public static void main(String[] args) {

        int x = 10;

        switch (x) {
            case 1:
                //do smth
            break;

            case 2:
            case 3:
            case 4:
                // do smth
            break;

            default:
                // do smth
        }

        switch (x) {
            case 1 -> System.out.println(":)");
            case 2,3,4,5 -> System.out.println(":(");
            default -> System.out.println("");
        }

    }
}
