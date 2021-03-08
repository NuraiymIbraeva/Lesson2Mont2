package com.company;

public class Transport implements Printaable {
    private String name;
    private int type;
    private Color color;


    public Transport(String name, int type, Color color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String print() {
        return "Transport " + "\nName " +getName() + "\nType " + getType() + "\nColor " + getColor();
    }
}
