package com.company;

import javax.security.auth.login.CredentialException;

public class Main {

    public static void main(String[] args) {
        //В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createOcject,
        // и распечатать по ним информацию методом print();
        System.out.println(createObject("Bycicle").print());
        System.out.println(createObject("Car").print());
        System.out.println(createObject("Moto").print());
    }
    // В классе Main создать возвращаемый метод createObject(String className), который умеет создавать объекты класса 2й, 3й и
    // 4й и после
    //// создания и задания свойств объекту метод возвращает ссылку на объект (пульт).
    // Можно использовать switch для того чтоб определить какого типа нужно создать экземпляр объекта.
    // Например если в параметре передается “2й” метод должен создать объект именно этого типа.

    public static Printaable createObject(String className) {
        Printaable printaable = null;
        switch (className) {
            case "Moto":
                printaable = new Moto("mers", 4, Color.BLACK, "Four", 3);
                break;
            case "Car":
                printaable = new Car("BMV", 32, Color.GREEN, "four", 2);
                break;
            case "Bycicle":
                printaable = new Bycicle("lbv", 56, Color.YELLOW, 2);
                break;

        }
        return printaable;
    }
}


//2)  (Дэдлайн 28.02.2021 23:59) :
//a)  Доделать все пункты практического задания из презентации.
//b)  Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
//c)  Создать Интерфейс Printable с методом void print();
//d)  Реализовать интерфейс Printable классами 2й, 3й и 4й, переопределить метод интерфейса так чтобы он распечатывал
// всю информацию о свойствах объекта.
//e)  В классе Main создать возвращаемый метод createObject(String className), который умеет создавать объекты класса 2й, 3й и 4й и после
// создания и задания свойств объекту метод возвращает ссылку на объект (пульт). Можно использовать switch для того чтоб определить какого типа нужно создать
// экземпляр объекта. Например если в параметре передается “2й” метод должен создать объект именно этого типа.
//f)  В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createOcject, и распечатать по ним информацию методом print();