package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Store {
    private static final String BLOCK_DIVIDER = "---------------------------------------------------------------------";
    private final Set<Notebook> notebooks = new HashSet<>();

    public static void main(String[] args) {
        var store = new Store();
       // writeTestData(store);

        var inputManager = new Scanner(System.in);
        while (true) {
            var id = store.showMenu(inputManager, "1-ADD, 2-FILTER, 3-PRINT, 0-EXIT", 0, 3);
            if (id == 0)
                break;

            System.out.println(BLOCK_DIVIDER);
            switch (id) {
                case 1: {
                    var notebook = InputNotebook.input(inputManager);
                    store.addNotebook(notebook);
                    break;
                }
                case 2: {
                    var filters = InputFilter.input(inputManager);
                    var notebooks = FilterNotebook.doFilter(store.getNotebooks(), filters);
                    System.out.println(BLOCK_DIVIDER);
                    PrinterNotebook.printAll(notebooks);
                    break;
                }
                case 3: {
                    PrinterNotebook.printAll(store.getNotebooks());
                    break;
                }
            }
        }

        inputManager.close();
    }

//    private static void writeTestData(Store store) {
//        store.addNotebook(new Notebook("ASUS", "X", "WINDOWS", 8, 1024, 14));
//        store.addNotebook(new Notebook("HP", "XX", "UNIX", 2, 512, 14));
//        store.addNotebook(new Notebook("DELL", "XX", "LINUX", 4, 1024, 17));
//        store.addNotebook(new Notebook("APPLE", "XXXX", "MACOS", 16, 2048, 17));
//    }

    public Set<Notebook> getNotebooks() {
        return notebooks;
    }

    public int showMenu(Scanner in, String menuCaptions, int min, int max) {
        System.out.println(BLOCK_DIVIDER);
        System.out.print(menuCaptions);
        int id = -1;

        do {
            System.out.format("\nchoose (%d-%d): ", min, max);
            while (!in.hasNextInt()) {
                in.next();
                System.out.format("\nchoose (%d-%d): ", min, max);
            }

            id = in.nextInt();
        } while (id < min && id > max);

        return id;
    }

    private void addNotebook(Notebook notebook) {
        this.notebooks.add(notebook);
    }
}