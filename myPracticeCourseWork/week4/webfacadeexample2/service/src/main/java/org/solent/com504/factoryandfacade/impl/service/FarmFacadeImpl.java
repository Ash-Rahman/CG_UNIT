package org.solent.com504.factoryandfacade.impl.service;

import java.util.ArrayList;
import java.util.List;
import org.solent.com504.factoryandfacade.model.dao.AnimalDao;
import org.solent.com504.factoryandfacade.model.dao.AnimalTypeDao;
import org.solent.com504.factoryandfacade.model.dto.Animal;
import org.solent.com504.factoryandfacade.model.dto.AnimalType;
import org.solent.com504.factoryandfacade.model.service.FarmFacade;

public class FarmFacadeImpl implements FarmFacade {

    private AnimalDao animalDao = null;

    private AnimalTypeDao animalTypeDao = null;

    // setters for DAOs
    public void setAnimalDao(AnimalDao animalDao) {
        this.animalDao = animalDao;
    }

    public void setAnimalTypeDao(AnimalTypeDao animalTypeDao) {
        this.animalTypeDao = animalTypeDao;
    }

    // Farm facade methods
    @Override
    public List<Animal> getAllAnimals() {
        return animalDao.retrieveAll();
    }

    @Override
    public Animal addAnimal(String animalTypeString, String name) {
        if (name == null || name.isEmpty()) {
            
        }
        
        AnimalType animaltype = new AnimalType();
        animaltype.setType(animalTypeString);
        
        Animal animal = new Animal();
        animal.setName(name);
        animal.setAnimalType(animaltype);
        
        animalDao.updateOrSave(animal);

        return animal;
    }

    @Override
    public List<Animal> getAnimalsOfType(String animalType) {
        
        AnimalType animalTypes = animalTypeDao.getAnimalType(animalType);
        Animal animalTemplate = new Animal();
        
        animalTemplate.setAnimalType(animalTypes);
        List<Animal> animals = animalDao.retrieve(animalTemplate);
        
        return animals;
    }

    @Override
    public Animal getAnimal(String name) {
        
        Animal animalTemplate = new Animal();
        animalTemplate.setName(name);
        List<Animal> animals = animalDao.retrieve(animalTemplate);
        if(animals.isEmpty()){
            return null;
        }
        return animals.get(0);
    }

    @Override
    public boolean removeAnimal(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getSupportedAnimalTypes() {
        List<String> animalTypeStrings = new ArrayList();
        List<AnimalType> animalTypes = animalTypeDao.getSupportedAnimalTypes();
        
        for (AnimalType type : animalTypes) {
             animalTypeStrings.add(type.getType());
        }

        return animalTypeStrings;

    }
}