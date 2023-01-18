package Pets;

import Humans.Person;

public class Dog extends Pet{
    public Dog(String name, Person owner) {
        super(name, owner);
    }
    @Override
    public void voice() {
        System.out.println("Гав-гав!");
    }

    @Override
    public String toString() {
        return String.format("Собака с именем %s, хозяин %s", name, owner.getFullName());
    }
}
