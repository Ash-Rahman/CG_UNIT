package org.solent.com504.factoryandfacade.impl;

import org.solent.com504.factoryandfacade.model.Turtle;

public class TurtleImpl extends AbstractAnimal implements Turtle {

    @Override
    public String getSound() {
        return Turtle.SOUND;
    }

    @Override
    public String getAnimalType() {
        return Turtle.ANIMAL_TYPE;
    }
}
