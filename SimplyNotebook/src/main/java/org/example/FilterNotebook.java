package org.example;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

public class FilterNotebook {

    public static Set<Notebook> doFilter(Set<Notebook> notebooks, HashMap<String, Object> filters) {
        if (filters == null || filters.isEmpty())
            return notebooks;

        Stream<Notebook> stream = null;
        if (filters.containsKey(NotebookFields.MANUFACTURER)) {
            stream = notebooks.stream().filter(itm -> Objects.equals(itm.getManufacturer(), String.valueOf(filters.get(NotebookFields.MANUFACTURER))));
        } else
            stream = notebooks.stream();

        if (filters.containsKey(NotebookFields.MODEL)) {
            stream = stream.filter(itm -> Objects.equals(itm.getModel(), String.valueOf(filters.get(NotebookFields.MODEL))));
        }

        if (filters.containsKey(NotebookFields.SYSTEM)) {
            stream = stream.filter(itm -> Objects.equals(itm.getSystem(), String.valueOf(filters.get(NotebookFields.SYSTEM))));
        }

        if (filters.containsKey(NotebookFields.RAM)) {
            stream = stream.filter(itm -> itm.getRam() <= (int)(filters.get(NotebookFields.RAM)));
        }

        if (filters.containsKey(NotebookFields.HDD)) {
            stream = stream.filter(itm -> itm.getRam() <= (int)(filters.get(NotebookFields.HDD)));
        }

        if (filters.containsKey(NotebookFields.DISPLAY_SIZE)) {
            stream = stream.filter(itm -> itm.getRam() <= (int)(filters.get(NotebookFields.DISPLAY_SIZE)));
        }

        return Set.copyOf(stream.toList());
    }
}
