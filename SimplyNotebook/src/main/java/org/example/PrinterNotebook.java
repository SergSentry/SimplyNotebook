package org.example;

import java.util.Set;

public class PrinterNotebook {
    public static void printAll(Set<Notebook> notebooks) {
        if (notebooks == null || notebooks.isEmpty()) {
            System.out.println("Empty data");
            return;
        }

        for (var item: notebooks) {
            print(item);
        }
    }

    private static void print(Notebook item) {
        System.out.println("Notebook info:");
        System.out.format("\tManufacturer: %s\n", item.getManufacturer());
        System.out.format("\tModel: %s\n", item.getModel());
        System.out.format("\tSystem: %s\n", item.getSystem());
        System.out.format("\tRAM: %d\n", item.getRam());
        System.out.format("\tHDD: %d\n", item.getHdd());
        System.out.format("\tDisplay size: %d\n", item.getDisplaySize());
    }
}
