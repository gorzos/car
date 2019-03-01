package com.company;

public class Car {
    private int age;
    private static final String NAME ="SOme Name";

    public static void dsfgdf(Car c , Car c2) {

        System.out.println(c.getAge()+c2.getAge());
    }


    public Car(int car) {
        this.age = car;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
