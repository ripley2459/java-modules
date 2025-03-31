package fr.cyrilneveu.server;

import fr.cyrilneveu.common.Utils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from server!");

        int result = Utils.add(3, 3);
        System.out.println("Result=" + result);
    }
}