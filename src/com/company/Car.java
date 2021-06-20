package com.company;

public class Car {
    private String Name;
    private int age;
    private int yearManufacture;
    private int engine;

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }


    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }


    public int getYearManufacture() {
        return yearManufacture;
    }



    public int getEngine() {
        return engine;
    }

    public Car() {

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Car{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", yearManufacture=" + yearManufacture +
                ", engine=" + engine +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Car car = (Car) object;
        return age == car.age && yearManufacture == car.yearManufacture && engine == car.engine && java.util.Objects.equals(Name, car.Name);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), Name, age, yearManufacture, engine);
    }
}


