package com.company;

public class Main {

    public static void main(String[] args) {

//        Car car = new Car(1);
//        Car car2 = new Car(2);
//        System.out.println(car.getAge());
//        System.out.println(car2.getAge());
//        car.dsfgdf(car,car2);

        Сar car = new Car(1); // ссылочный тип
        Car car2 = car;
        car2.setAge(5);
        System.out.println(car.getAge());
        System.out.println(car2.getAge());
        int i1 = 1; // Примитивный тип даных
        int i2 = i1;
        i2 = 5;
        System.out.println(i1);
        System.out.println(i2);
    }
}
