package org.example;

import java.util.Scanner;

public class InputNotebook {
    public static Notebook input(Scanner scanner) {
        var notebook = new Notebook();
        System.out.println("Input notebook info.\n");
        System.out.print("Input a manufacture: ");
        notebook.setManufacturer(scanner.next().trim());
        System.out.print("Input a model: ");
        notebook.setModel(scanner.next().trim());
        System.out.print("Input a system type: ");
        notebook.setSystem(scanner.next().trim());

        System.out.print("Input ram size: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Input ram size: ");
        }
        notebook.setRam(scanner.nextInt());

        System.out.print("Input hdd size: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Input hdd size: ");
        }
        notebook.setHdd(scanner.nextInt());

        System.out.print("Input display size: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Input display size: ");
        }
        notebook.setDisplaySize(scanner.nextInt());

        return notebook;
    }
}