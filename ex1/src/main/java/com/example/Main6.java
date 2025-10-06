package com.example;

public class Main6 {

    public static void main(String[] args) {

        Object o = 10;

        switch (o) {
            case Integer i:
                System.out.println("1 " + i);
                break;

            case String s:
                System.out.println("1 " + s);
                break;

            default:
                System.out.println("2");
        }

        switch (o) {
            case Integer i -> System.out.println("1 " + i);
            case String s -> System.out.println("1 " + s);
            default -> System.out.println("3");
        }

        switch (o) {
            case Integer i when i == 1 -> System.out.println("1 " + i);
            case Integer i when i > 1 -> System.out.println("! " + i);
            case String s -> System.out.println("1 " + s);
            default -> System.out.println("3");
        }


    }
}
