package org.example;

public class Notebook {
    private String manufacturer;
    private String model;
    private String system;
    private int ram;
    private int hdd;
    private int displaySize;

    public Notebook() {
    }

    public Notebook(String manufacturer, String model, String system, int ram, int hdd, int displaySize) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.system = system;
        this.ram = ram;
        this.hdd = hdd;
        this.displaySize = displaySize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }
}
