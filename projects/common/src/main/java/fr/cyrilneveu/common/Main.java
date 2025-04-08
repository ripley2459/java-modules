package fr.cyrilneveu.common;

import fr.cyrilneveu.core.Utils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from common!");
        System.out.println("Args=");
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);

        Utils.loadVtk();
        Utils.createFrame();
    }
}
