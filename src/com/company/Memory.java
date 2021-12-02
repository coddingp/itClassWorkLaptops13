package com.company;

public class Memory {

    private String model;
    double size;


    public Memory(String model,
                  double size) {
        this.model = model;
        this.size = size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public void print() {
        System.out.println(model + " " + size);

    }

    @Override
    public String toString() {
        String massage = "Model of the laptop: " + this.model + "  Memory size: " + size;
        return massage;
    }


}