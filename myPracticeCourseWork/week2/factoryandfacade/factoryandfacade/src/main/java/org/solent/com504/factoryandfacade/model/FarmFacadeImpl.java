/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.factoryandfacade.model;

import java.util.ArrayList;
import java.util.List;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.FarmFacade;

/**
 *
 * @author cgallen
 */
public class FarmFacadeImpl implements FarmFacade {

    ArrayList<Animal> allAnimals = new ArrayList<Animal>(); // Create an ArrayList object

    public List<Animal> getAllAnimals() {
        return allAnimals;
    }

    public void addDog(String name) {
        Dog dog = new Dog();
        dog.setName(name);
        allAnimals.add(dog);
    }

    public void addCat(String name) {
        Cat cat = new Cat();
        cat.setName(name);
        allAnimals.add(cat);
    }

    public void addCow(String name) {
        Cow cow = new Cow();
        cow.setName(name);
        allAnimals.add(cow);
    }

    public void addTurtle(String name) {
        Turtle turtle = new Cow();
        turtle.setName(name);
        allAnimals.add(turtle);
    }
}
