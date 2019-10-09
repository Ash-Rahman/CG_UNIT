package org.solent.com504.factoryandfacade.model;

public class AnimalObjectFactory{

    public static Animal createCat() {
        return new Cat();
    }

    public static Animal createDog() {
        return new Dog();
    }

    public static Animal createCow() {
        return new Cow();
    }

    public static Animal createTurtle() { return new Turtle(); }

    public static FarmFacade createFarmFacade() {
        FarmFacade facade = new FarmFacadeImpl();
        return facade;
    }
}
