package com.company;

import com.company.BuilderCar;

public class VisitCar  {
    public static void main(String[] args) {
        Car mycar= BuilderCar.get()
                .addAge(2012)
                .addEngine(2000)
                .addName("Astra")
                .addYearManufacture(1994)
                .build();
        System.out.println("My Car="+mycar);
    }

}
