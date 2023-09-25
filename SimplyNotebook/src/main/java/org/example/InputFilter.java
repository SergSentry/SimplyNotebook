package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class InputFilter {
    public static HashMap<String, Object> input(Scanner scanner) {
        var filter = new HashMap<String, Object>();

        if (getAnswer(scanner, "Add filter by manufacturer ?")) {
            System.out.print("Input a manufacture: ");
            filter.put(NotebookFields.MANUFACTURER, scanner.next().trim());
        }

        if (getAnswer(scanner, "Add filter by model ?")) {
            System.out.print("Input a model: ");
            filter.put(NotebookFields.MODEL, scanner.next().trim());
        }

        if (getAnswer(scanner, "Add filter by system ?")) {
            System.out.print("Input a system: ");
            filter.put(NotebookFields.SYSTEM, scanner.next().trim());
        }

        if (getAnswer(scanner, "Add filter by ram size ?")) {
            System.out.print("Input ram size: ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Input ram size: ");
            }
            filter.put(NotebookFields.RAM, scanner.nextInt());
        }

        if (getAnswer(scanner, "Add filter by hdd size ?")) {
            System.out.print("Input hdd size: ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Input hdd size: ");
            }
            filter.put(NotebookFields.HDD, scanner.nextInt());
        }

        if (getAnswer(scanner, "Add filter by display size ?")) {
            System.out.print("Input display size: ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Input display size: ");
            }
            filter.put(NotebookFields.DISPLAY_SIZE, scanner.nextInt());
        }

        return filter;
    }

    private static boolean getAnswer(Scanner scanner, String question) {
        System.out.printf("%s (y/n): ", question);
        String value = scanner.next().trim().toLowerCase();
        return value.equals("y");
    }
}