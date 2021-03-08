package com.company;

public class Bycicle extends Transport {
    private int wheels;

    public Bycicle(String name, int type, Color color, int wheels) {
        super(name, type, color);
        this.wheels = wheels;
    }

    @Override
    public String print() {
        return super.print()+ "Car " + "\nWheels" +getWheels();
        // Реализовать интерфейс Printable классами 2й, 3й и 4й, переопределить метод интерфейса так чтобы он распечатывал
        //// всю информацию о свойствах объекта.

    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
