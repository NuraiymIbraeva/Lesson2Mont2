package com.company;

public class Car extends Transport{
    private String wheels;
    private int volume;

    public Car(String name, int type, Color color, String wheels, int volume) {
        super(name, type, color);
        this.wheels = wheels;
        this.volume = volume;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String print() {
        return super.print()+ "Car " + "\nWheels" +getWheels() + "\nVolume" + getVolume();
        // Реализовать интерфейс Printable классами 2й, 3й и 4й, переопределить метод интерфейса так чтобы он распечатывал
        //// всю информацию о свойствах объекта.
    }

}
