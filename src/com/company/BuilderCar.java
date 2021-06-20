package com.company;

public class BuilderCar {
    private Car car;

   private BuilderCar(){
     car=new Car();
   }

   public static BuilderCar get(){
       return new BuilderCar();
   }

    public BuilderCar addName(String name) {
        car.setName(name);
        return this;

    }

    public BuilderCar addAge(int age) {
        car.setAge(age);
        return this;
    }

    public BuilderCar addYearManufacture(int yearManufacture) {
        car.setYearManufacture(yearManufacture);
        return this;
    }

    public BuilderCar addEngine(int engine) {
        car.setEngine(engine);
        return this;
    }

    public Car build(){
       return car;
    }
}

